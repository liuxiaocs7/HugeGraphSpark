package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.hugegraph.driver.GraphManager;
import org.apache.hugegraph.driver.GremlinManager;
import org.apache.hugegraph.driver.HugeClient;
import org.apache.hugegraph.driver.SchemaManager;
import org.apache.hugegraph.structure.constant.T;
import org.apache.hugegraph.structure.graph.Edge;
import org.apache.hugegraph.structure.graph.Path;
import org.apache.hugegraph.structure.graph.Vertex;
import org.apache.hugegraph.structure.gremlin.Result;
import org.apache.hugegraph.structure.gremlin.ResultSet;
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

        testHGClient();

        testSpark();

        testSingleExample();

        testBatchExample();
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

    public static void testSingleExample() {
        LOG.info("start single example");
        HugeClient hugeClient =
                HugeClient.builder(SERVER_PATH, DEFAULT_GRAPH).build();

        hugeClient.graphs().clearGraph(DEFAULT_GRAPH, "I'm sure to delete all data");

        SchemaManager schema = hugeClient.schema();

        schema.propertyKey("name").asText().ifNotExist().create();
        schema.propertyKey("age").asInt().ifNotExist().create();
        schema.propertyKey("city").asText().ifNotExist().create();
        schema.propertyKey("weight").asDouble().ifNotExist().create();
        schema.propertyKey("lang").asText().ifNotExist().create();
        schema.propertyKey("date").asDate().ifNotExist().create();
        schema.propertyKey("price").asInt().ifNotExist().create();

        schema.vertexLabel("person")
              .properties("name", "age", "city")
              .primaryKeys("name")
              .ifNotExist()
              .create();

        schema.vertexLabel("software")
              .properties("name", "lang", "price")
              .primaryKeys("name")
              .ifNotExist()
              .create();

        schema.indexLabel("personByCity")
              .onV("person")
              .by("city")
              .secondary()
              .ifNotExist()
              .create();

        schema.indexLabel("personByAgeAndCity")
              .onV("person")
              .by("age", "city")
              .secondary()
              .ifNotExist()
              .create();

        schema.indexLabel("softwareByPrice")
              .onV("software")
              .by("price")
              .range()
              .ifNotExist()
              .create();

        schema.edgeLabel("knows")
              .sourceLabel("person")
              .targetLabel("person")
              .properties("date", "weight")
              .ifNotExist()
              .create();

        schema.edgeLabel("created")
              .sourceLabel("person").targetLabel("software")
              .properties("date", "weight")
              .ifNotExist()
              .create();

        schema.indexLabel("createdByDate")
              .onE("created")
              .by("date")
              .secondary()
              .ifNotExist()
              .create();

        schema.indexLabel("createdByWeight")
              .onE("created")
              .by("weight")
              .range()
              .ifNotExist()
              .create();

        schema.indexLabel("knowsByWeight")
              .onE("knows")
              .by("weight")
              .range()
              .ifNotExist()
              .create();

        GraphManager graph = hugeClient.graph();
        Vertex marko = graph.addVertex(T.LABEL, "person", "name", "marko",
                                       "age", 29, "city", "Beijing");
        Vertex vadas = graph.addVertex(T.LABEL, "person", "name", "vadas",
                                       "age", 27, "city", "Hongkong");
        Vertex lop = graph.addVertex(T.LABEL, "software", "name", "lop",
                                     "lang", "java", "price", 328);
        Vertex josh = graph.addVertex(T.LABEL, "person", "name", "josh",
                                      "age", 32, "city", "Beijing");
        Vertex ripple = graph.addVertex(T.LABEL, "software", "name", "ripple",
                                        "lang", "java", "price", 199);
        Vertex peter = graph.addVertex(T.LABEL, "person", "name", "peter",
                                       "age", 35, "city", "Shanghai");

        marko.addEdge("knows", vadas, "date", "2016-01-10", "weight", 0.5);
        marko.addEdge("knows", josh, "date", "2013-02-20", "weight", 1.0);
        marko.addEdge("created", lop, "date", "2017-12-10", "weight", 0.4);
        josh.addEdge("created", lop, "date", "2009-11-11", "weight", 0.4);
        josh.addEdge("created", ripple, "date", "2017-12-10", "weight", 1.0);
        peter.addEdge("created", lop, "date", "2017-03-24", "weight", 0.2);

        GremlinManager gremlin = hugeClient.gremlin();
        System.out.println("==== Path ====");
        ResultSet resultSet = gremlin.gremlin("g.V().outE().path()").execute();
        Iterator<Result> results = resultSet.iterator();
        results.forEachRemaining(result -> {
            System.out.println(result.getObject().getClass());
            Object object = result.getObject();
            if (object instanceof Vertex) {
                System.out.println(((Vertex) object).id());
            } else if (object instanceof Edge) {
                System.out.println(((Edge) object).id());
            } else if (object instanceof Path) {
                List<Object> elements = ((Path) object).objects();
                elements.forEach(element -> {
                    System.out.println(element.getClass());
                    System.out.println(element);
                });
            } else {
                System.out.println(object);
            }
        });

        hugeClient.close();
        LOG.info("end single example");
    }

    private static void testBatchExample() {
        LOG.info("start batch example");
        HugeClient hugeClient =
                HugeClient.builder(SERVER_PATH, DEFAULT_GRAPH).build();

        hugeClient.graphs().clearGraph(DEFAULT_GRAPH, "I'm sure to delete all data");

        SchemaManager schema = hugeClient.schema();

        schema.propertyKey("name").asText().ifNotExist().create();
        schema.propertyKey("age").asInt().ifNotExist().create();
        schema.propertyKey("lang").asText().ifNotExist().create();
        schema.propertyKey("date").asDate().ifNotExist().create();
        schema.propertyKey("price").asInt().ifNotExist().create();

        schema.vertexLabel("person")
              .properties("name", "age")
              .primaryKeys("name")
              .ifNotExist()
              .create();

        schema.vertexLabel("person")
              .properties("price")
              .nullableKeys("price")
              .append();

        schema.vertexLabel("software")
              .properties("name", "lang", "price")
              .primaryKeys("name")
              .ifNotExist()
              .create();

        schema.indexLabel("softwareByPrice")
              .onV("software").by("price")
              .range()
              .ifNotExist()
              .create();

        schema.edgeLabel("knows")
              .link("person", "person")
              .properties("date")
              .ifNotExist()
              .create();

        schema.edgeLabel("created")
              .link("person", "software")
              .properties("date")
              .ifNotExist()
              .create();

        schema.indexLabel("createdByDate")
              .onE("created").by("date")
              .secondary()
              .ifNotExist()
              .create();

        // get schema object by name
        System.out.println(schema.getPropertyKey("name"));
        System.out.println(schema.getVertexLabel("person"));
        System.out.println(schema.getEdgeLabel("knows"));
        System.out.println(schema.getIndexLabel("createdByDate"));

        // list all schema objects
        System.out.println(schema.getPropertyKeys());
        System.out.println(schema.getVertexLabels());
        System.out.println(schema.getEdgeLabels());
        System.out.println(schema.getIndexLabels());

        GraphManager graph = hugeClient.graph();

        Vertex marko = new Vertex("person").property("name", "marko")
                                           .property("age", 29);
        Vertex vadas = new Vertex("person").property("name", "vadas")
                                           .property("age", 27);
        Vertex lop = new Vertex("software").property("name", "lop")
                                           .property("lang", "java")
                                           .property("price", 328);
        Vertex josh = new Vertex("person").property("name", "josh")
                                          .property("age", 32);
        Vertex ripple = new Vertex("software").property("name", "ripple")
                                              .property("lang", "java")
                                              .property("price", 199);
        Vertex peter = new Vertex("person").property("name", "peter")
                                           .property("age", 35);

        Edge markoKnowsVadas = new Edge("knows").source(marko).target(vadas)
                                                .property("date", "2016-01-10");
        Edge markoKnowsJosh = new Edge("knows").source(marko).target(josh)
                                               .property("date", "2013-02-20");
        Edge markoCreateLop = new Edge("created").source(marko).target(lop)
                                                 .property("date",
                                                           "2017-12-10");
        Edge joshCreateRipple = new Edge("created").source(josh).target(ripple)
                                                   .property("date",
                                                             "2017-12-10");
        Edge joshCreateLop = new Edge("created").source(josh).target(lop)
                                                .property("date", "2009-11-11");
        Edge peterCreateLop = new Edge("created").source(peter).target(lop)
                                                 .property("date",
                                                           "2017-03-24");

        List<Vertex> vertices = new ArrayList<>();
        vertices.add(marko);
        vertices.add(vadas);
        vertices.add(lop);
        vertices.add(josh);
        vertices.add(ripple);
        vertices.add(peter);

        List<Edge> edges = new ArrayList<>();
        edges.add(markoKnowsVadas);
        edges.add(markoKnowsJosh);
        edges.add(markoCreateLop);
        edges.add(joshCreateRipple);
        edges.add(joshCreateLop);
        edges.add(peterCreateLop);

        vertices = graph.addVertices(vertices);
        vertices.forEach(System.out::println);

        edges = graph.addEdges(edges, false);
        edges.forEach(System.out::println);

        hugeClient.close();
        LOG.info("end batch example");
    }
}

