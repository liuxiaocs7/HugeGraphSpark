# Spark Dev With HG-Client In IDEA

1. Set `JDK=1.8`
2. Add dependencies with provided scope to class path

```shell
2023-07-29 13:19:57 [main] [INFO ] o.e.Main [] - before client
2023-07-29 13:20:03 [main] [INFO ] o.e.Main [] - after client
2023-07-29 13:20:03 [main] [INFO ] o.e.Main [] - start spark
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SparkContext [] - Running Spark version 3.2.2
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceUtils [] - ==============================================================
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceUtils [] - No custom resources configured for spark.driver.
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceUtils [] - ==============================================================
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SparkContext [] - Submitted application: HelloWorldJava
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceProfile [] - Default ResourceProfile created, executor resources: Map(cores -> name: cores, amount: 1, script: , vendor: , memory -> name: memory, amount: 1024, script: , vendor: , offHeap -> name: offHeap, amount: 0, script: , vendor: ), task resources: Map(cpus -> name: cpus, amount: 1.0)
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceProfile [] - Limiting resource is cpu
2023-07-29 13:20:03 [main] [INFO ] o.a.s.r.ResourceProfileManager [] - Added ResourceProfile id: 0
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SecurityManager [] - Changing view acls to: liuxiaocs
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SecurityManager [] - Changing modify acls to: liuxiaocs
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SecurityManager [] - Changing view acls groups to: 
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SecurityManager [] - Changing modify acls groups to: 
2023-07-29 13:20:03 [main] [INFO ] o.a.s.SecurityManager [] - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(liuxiaocs); groups with view permissions: Set(); users  with modify permissions: Set(liuxiaocs); groups with modify permissions: Set()
2023-07-29 13:20:04 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'sparkDriver' on port 13751.
2023-07-29 13:20:04 [main] [INFO ] o.a.s.SparkEnv [] - Registering MapOutputTracker
2023-07-29 13:20:04 [main] [INFO ] o.a.s.SparkEnv [] - Registering BlockManagerMaster
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - BlockManagerMasterEndpoint up
2023-07-29 13:20:04 [main] [INFO ] o.a.s.SparkEnv [] - Registering BlockManagerMasterHeartbeat
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.DiskBlockManager [] - Created local directory at C:\Users\liuxiaocs\AppData\Local\Temp\blockmgr-3c29f071-f408-47bb-be39-03b0130b00ae
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.m.MemoryStore [] - MemoryStore started with capacity 4.1 GiB
2023-07-29 13:20:04 [main] [INFO ] o.a.s.SparkEnv [] - Registering OutputCommitCoordinator
2023-07-29 13:20:04 [main] [INFO ] o.s.j.u.log [] - Logging initialized @7467ms to org.sparkproject.jetty.util.log.Slf4jLog
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.Server [] - jetty-9.4.44.v20210927; built: 2021-09-27T23:02:44.612Z; git: 8da83308eeca865e495e53ef315a249d63ba9332; jvm 1.8.0_291-b10
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.Server [] - Started @7533ms
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.AbstractConnector [] - Started ServerConnector@20999517{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}
2023-07-29 13:20:04 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'SparkUI' on port 4040.
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4ed15347{/jobs,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@34208baa{/jobs/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@6707a4bf{/jobs/job,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@f0a66bd{/jobs/job/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@1cf336fd{/stages,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@41ef1ea2{/stages/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@583fb274{/stages/stage,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@104dc1a2{/stages/stage/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@314a31b0{/stages/pool,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@59edb4f5{/stages/pool/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4735d6e5{/storage,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4dad0eed{/storage/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@164642a4{/storage/rdd,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@50b0afd7{/storage/rdd/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@62765aec{/environment,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@3a401749{/environment/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@27e2287c{/executors,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@2cd388f5{/executors/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@70d77826{/executors/threadDump,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4f169009{/executors/threadDump/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4207852d{/static,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@6cfbbff7{/,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@45b32dfe{/api,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@61874b9d{/jobs/job/kill,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4f2d014a{/stages/stage/kill,null,AVAILABLE,@Spark}
2023-07-29 13:20:04 [main] [INFO ] o.a.s.u.SparkUI [] - Bound SparkUI to 0.0.0.0, and started at http://LAPTOP-78ELKTKJ.mshome.net:4040
2023-07-29 13:20:04 [main] [INFO ] o.a.s.e.Executor [] - Starting executor ID driver on host LAPTOP-78ELKTKJ.mshome.net
2023-07-29 13:20:04 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 13774.
2023-07-29 13:20:04 [main] [INFO ] o.a.s.n.n.NettyBlockTransferService [] - Server created on LAPTOP-78ELKTKJ.mshome.net:13774
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManager [] - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManagerMaster [] - Registering BlockManager BlockManagerId(driver, LAPTOP-78ELKTKJ.mshome.net, 13774, None)
2023-07-29 13:20:04 [dispatcher-BlockManagerMaster] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - Registering block manager LAPTOP-78ELKTKJ.mshome.net:13774 with 4.1 GiB RAM, BlockManagerId(driver, LAPTOP-78ELKTKJ.mshome.net, 13774, None)
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManagerMaster [] - Registered BlockManager BlockManagerId(driver, LAPTOP-78ELKTKJ.mshome.net, 13774, None)
2023-07-29 13:20:04 [main] [INFO ] o.a.s.s.BlockManager [] - Initialized BlockManager: BlockManagerId(driver, LAPTOP-78ELKTKJ.mshome.net, 13774, None)
2023-07-29 13:20:04 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@286855ea{/metrics/json,null,AVAILABLE,@Spark}
2023-07-29 13:20:05 [main] [INFO ] o.a.s.SparkContext [] - Starting job: collect at Main.java:110
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Got job 0 (collect at Main.java:110) with 1 output partitions
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Final stage: ResultStage 0 (collect at Main.java:110)
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Parents of final stage: List()
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Missing parents: List()
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Submitting ResultStage 0 (ParallelCollectionRDD[0] at parallelize at Main.java:107), which has no missing parents
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.m.MemoryStore [] - Block broadcast_0 stored as values in memory (estimated size 3.1 KiB, free 4.1 GiB)
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.m.MemoryStore [] - Block broadcast_0_piece0 stored as bytes in memory (estimated size 1882.0 B, free 4.1 GiB)
2023-07-29 13:20:05 [dispatcher-BlockManagerMaster] [INFO ] o.a.s.s.BlockManagerInfo [] - Added broadcast_0_piece0 in memory on LAPTOP-78ELKTKJ.mshome.net:13774 (size: 1882.0 B, free: 4.1 GiB)
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.SparkContext [] - Created broadcast 0 from broadcast at DAGScheduler.scala:1478
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Submitting 1 missing tasks from ResultStage 0 (ParallelCollectionRDD[0] at parallelize at Main.java:107) (first 15 tasks are for partitions Vector(0))
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Adding task set 0.0 with 1 tasks resource profile 0
2023-07-29 13:20:05 [dispatcher-event-loop-0] [INFO ] o.a.s.s.TaskSetManager [] - Starting task 0.0 in stage 0.0 (TID 0) (LAPTOP-78ELKTKJ.mshome.net, executor driver, partition 0, PROCESS_LOCAL, 4493 bytes) taskResourceAssignments Map()
2023-07-29 13:20:05 [Executor task launch worker for task 0.0 in stage 0.0 (TID 0)] [INFO ] o.a.s.e.Executor [] - Running task 0.0 in stage 0.0 (TID 0)
2023-07-29 13:20:05 [Executor task launch worker for task 0.0 in stage 0.0 (TID 0)] [INFO ] o.a.s.e.Executor [] - Finished task 0.0 in stage 0.0 (TID 0). 881 bytes result sent to driver
2023-07-29 13:20:05 [task-result-getter-0] [INFO ] o.a.s.s.TaskSetManager [] - Finished task 0.0 in stage 0.0 (TID 0) in 199 ms on LAPTOP-78ELKTKJ.mshome.net (executor driver) (1/1)
2023-07-29 13:20:05 [task-result-getter-0] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Removed TaskSet 0.0, whose tasks have all completed, from pool 
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - ResultStage 0 (collect at Main.java:110) finished in 0.324 s
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Job 0 is finished. Cancelling potential speculative or zombie tasks for this job
2023-07-29 13:20:05 [dag-scheduler-event-loop] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Killing all running tasks in stage 0: Stage finished
2023-07-29 13:20:05 [main] [INFO ] o.a.s.s.DAGScheduler [] - Job 0 finished: collect at Main.java:110, took 0.353002 s
[Hello,World, Hello,Spark, Hello,BigData]
org.apache.spark.SparkConf@5ac53c06
2023-07-29 13:20:05 [main] [INFO ] o.e.Main [] - end spark
2023-07-29 13:20:05 [main] [INFO ] o.e.Main [] - start single example
==== Path ====
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:josh, label=person, properties={name=josh, age=32, city=Beijing}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:josh>2>>S2:lop, sourceId=1:josh, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={weight=0.4, date=2009-11-11 00:00:00.000}}
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:josh, label=person, properties={name=josh, age=32, city=Beijing}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:josh>2>>S2:ripple, sourceId=1:josh, sourceLabel=person, targetId=2:ripple, targetLabel=software, label=created, properties={weight=1.0, date=2017-12-10 00:00:00.000}}
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:marko, label=person, properties={name=marko, age=29, city=Beijing}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:marko>1>>S1:josh, sourceId=1:marko, sourceLabel=person, targetId=1:josh, targetLabel=person, label=knows, properties={weight=1.0, date=2013-02-20 00:00:00.000}}
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:marko, label=person, properties={name=marko, age=29, city=Beijing}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:marko>1>>S1:vadas, sourceId=1:marko, sourceLabel=person, targetId=1:vadas, targetLabel=person, label=knows, properties={weight=0.5, date=2016-01-10 00:00:00.000}}
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:marko, label=person, properties={name=marko, age=29, city=Beijing}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:marko>2>>S2:lop, sourceId=1:marko, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={weight=0.4, date=2017-12-10 00:00:00.000}}
class org.apache.hugegraph.structure.graph.Path
class org.apache.hugegraph.structure.graph.Vertex
{id=1:peter, label=person, properties={name=peter, age=35, city=Shanghai}}
class org.apache.hugegraph.structure.graph.Edge
{id=S1:peter>2>>S2:lop, sourceId=1:peter, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={weight=0.2, date=2017-03-24 00:00:00.000}}
2023-07-29 13:20:09 [main] [INFO ] o.e.Main [] - end single example
2023-07-29 13:20:09 [main] [INFO ] o.e.Main [] - start batch example
{name=name, cardinality=SINGLE, dataType=TEXT, aggregateType=NONE, properties=[], writeType=OLTP}
{name=person, idStrategy=PRIMARY_KEY, primaryKeys=[name], indexLabels=[], nullableKeys=[price], properties=[price, name, age], ttl=0, ttlStartTime=null, status=CREATED}
{name=knows, sourceLabel=person, targetLabel=person, sortKeys=[], indexLabels=[], nullableKeys=[], properties=[date], ttl=0, ttlStartTime=null, status=CREATED}
{name=createdByDate, baseType=EDGE_LABEL, baseValue=created, indexType=SECONDARY, fields=[date], status=CREATED}
[{name=lang, cardinality=SINGLE, dataType=TEXT, aggregateType=NONE, properties=[], writeType=OLTP}, {name=age, cardinality=SINGLE, dataType=INT, aggregateType=NONE, properties=[], writeType=OLTP}, {name=price, cardinality=SINGLE, dataType=INT, aggregateType=NONE, properties=[], writeType=OLTP}, {name=date, cardinality=SINGLE, dataType=DATE, aggregateType=NONE, properties=[], writeType=OLTP}, {name=name, cardinality=SINGLE, dataType=TEXT, aggregateType=NONE, properties=[], writeType=OLTP}]
[{name=person, idStrategy=PRIMARY_KEY, primaryKeys=[name], indexLabels=[], nullableKeys=[price], properties=[price, name, age], ttl=0, ttlStartTime=null, status=CREATED}, {name=software, idStrategy=PRIMARY_KEY, primaryKeys=[name], indexLabels=[softwareByPrice], nullableKeys=[], properties=[price, name, lang], ttl=0, ttlStartTime=null, status=CREATED}]
[{name=knows, sourceLabel=person, targetLabel=person, sortKeys=[], indexLabels=[], nullableKeys=[], properties=[date], ttl=0, ttlStartTime=null, status=CREATED}, {name=created, sourceLabel=person, targetLabel=software, sortKeys=[], indexLabels=[createdByDate], nullableKeys=[], properties=[date], ttl=0, ttlStartTime=null, status=CREATED}]
[{name=softwareByPrice, baseType=VERTEX_LABEL, baseValue=software, indexType=RANGE, fields=[price], status=CREATED}, {name=createdByDate, baseType=EDGE_LABEL, baseValue=created, indexType=SECONDARY, fields=[date], status=CREATED}]
{id=1:marko, label=person, properties={name=marko, age=29}}
{id=1:vadas, label=person, properties={name=vadas, age=27}}
{id=2:lop, label=software, properties={price=328, name=lop, lang=java}}
{id=1:josh, label=person, properties={name=josh, age=32}}
{id=2:ripple, label=software, properties={price=199, name=ripple, lang=java}}
{id=1:peter, label=person, properties={name=peter, age=35}}
{id=S1:marko>1>>S1:vadas, sourceId=1:marko, sourceLabel=person, targetId=1:vadas, targetLabel=person, label=knows, properties={date=2016-01-10}}
{id=S1:marko>1>>S1:josh, sourceId=1:marko, sourceLabel=person, targetId=1:josh, targetLabel=person, label=knows, properties={date=2013-02-20}}
{id=S1:marko>2>>S2:lop, sourceId=1:marko, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={date=2017-12-10}}
{id=S1:josh>2>>S2:ripple, sourceId=1:josh, sourceLabel=person, targetId=2:ripple, targetLabel=software, label=created, properties={date=2017-12-10}}
{id=S1:josh>2>>S2:lop, sourceId=1:josh, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={date=2009-11-11}}
{id=S1:peter>2>>S2:lop, sourceId=1:peter, sourceLabel=person, targetId=2:lop, targetLabel=software, label=created, properties={date=2017-03-24}}
2023-07-29 13:20:11 [main] [INFO ] o.e.Main [] - end batch example
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.SparkContext [] - Invoking stop() from shutdown hook
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.s.j.s.AbstractConnector [] - Stopped Spark@20999517{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.u.SparkUI [] - Stopped Spark web UI at http://LAPTOP-78ELKTKJ.mshome.net:4040
2023-07-29 13:20:11 [dispatcher-event-loop-1] [INFO ] o.a.s.MapOutputTrackerMasterEndpoint [] - MapOutputTrackerMasterEndpoint stopped!
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.s.m.MemoryStore [] - MemoryStore cleared
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.s.BlockManager [] - BlockManager stopped
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.s.BlockManagerMaster [] - BlockManagerMaster stopped
2023-07-29 13:20:11 [dispatcher-event-loop-1] [INFO ] o.a.s.s.OutputCommitCoordinator$OutputCommitCoordinatorEndpoint [] - OutputCommitCoordinator stopped!
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.SparkContext [] - Successfully stopped SparkContext
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.u.ShutdownHookManager [] - Shutdown hook called
2023-07-29 13:20:11 [shutdown-hook-0] [INFO ] o.a.s.u.ShutdownHookManager [] - Deleting directory C:\Users\liuxiaocs\AppData\Local\Temp\spark-02fd1559-3338-4838-9f2a-327f22319681
```