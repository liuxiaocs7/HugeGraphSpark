package org.example;

import java.util.Arrays;

import org.apache.hugegraph.driver.GraphManager;
import org.apache.hugegraph.driver.HugeClient;
import org.apache.hugegraph.driver.SchemaManager;
import org.apache.hugegraph.structure.constant.T;
import org.apache.hugegraph.structure.graph.Vertex;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static final String DEFAULT_GRAPH = "hugegraph";

    public static final String SERVER_PATH = "http://192.168.34.164:18080";

    public static void main(String[] args) {

        testSpark();

        testHGClient();
    }

    private static void testHGClient() {
        LOG.info("before client");

        HugeClient hugeClient =
                HugeClient.builder(SERVER_PATH, DEFAULT_GRAPH).build();

        hugeClient.graphs().clearGraph(DEFAULT_GRAPH, "I'm sure to delete all data");

        SchemaManager schema = hugeClient.schema();

        schema.propertyKey("name").asText().ifNotExist().create();
        schema.propertyKey("age").asInt().ifNotExist().create();
        schema.propertyKey("city").asText().ifNotExist().create();
        schema.propertyKey("weight").asDouble().ifNotExist().create();
        schema.propertyKey("lang").asText().ifNotExist().create();
        schema.propertyKey("date").asText().ifNotExist().create();
        schema.propertyKey("price").asInt().ifNotExist().create();
        schema.vertexLabel("person").properties("name", "age", "city").primaryKeys("name")
              .ifNotExist().create();
        schema.vertexLabel("software").properties("name", "lang", "price").primaryKeys("name")
              .ifNotExist().create();
        schema.indexLabel("personByCity").onV("person").by("city").secondary().ifNotExist()
              .create();
        schema.indexLabel("personByAgeAndCity").onV("person").by("age", "city").secondary()
              .ifNotExist().create();
        schema.indexLabel("softwareByPrice").onV("software").by("price").range().ifNotExist()
              .create();
        schema.edgeLabel("knows").sourceLabel("person").targetLabel("person")
              .properties("date", "weight").ifNotExist().create();
        schema.edgeLabel("created").sourceLabel("person").targetLabel("software")
              .properties("date", "weight").ifNotExist().create();
        schema.indexLabel("createdByDate").onE("created").by("date").secondary().ifNotExist()
              .create();
        schema.indexLabel("createdByWeight").onE("created").by("weight").range().ifNotExist()
              .create();
        schema.indexLabel("knowsByWeight").onE("knows").by("weight").range().ifNotExist().create();

        GraphManager graph = hugeClient.graph();
        Vertex marko =
                graph.addVertex(T.LABEL, "person", "name", "marko", "age", 29, "city", "Beijing");
        Vertex vadas =
                graph.addVertex(T.LABEL, "person", "name", "vadas", "age", 27, "city", "Hongkong");
        Vertex lop =
                graph.addVertex(T.LABEL, "software", "name", "lop", "lang", "java", "price", 328);
        Vertex josh =
                graph.addVertex(T.LABEL, "person", "name", "josh", "age", 32, "city", "Beijing");
        Vertex ripple =
                graph.addVertex(T.LABEL, "software", "name", "ripple", "lang", "java", "price",
                                199);
        Vertex peter =
                graph.addVertex(T.LABEL, "person", "name", "peter", "age", 35, "city", "Shanghai");

        hugeClient.close();

        LOG.info("after client");
    }

    private static void testSpark() {
        LOG.info("start spark");

        SparkConf conf = new SparkConf().setMaster("local").setAppName("HelloWorldJava");

        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> helloWorld = sc.parallelize(
                Arrays.asList("Hello,World", "Hello,Spark", "Hello,BigData"));

        System.out.println(helloWorld.collect());
        System.out.println(conf);

        LOG.info("end spark");
    }
}

