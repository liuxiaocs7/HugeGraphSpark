# Spark Dev With HG-Client In IDEA

1. Set `JDK=1.8`
2. Add dependencies with provided scope to class path

```shell
2023-07-29 01:40:59 [main] [INFO ] o.e.Main [] - before client
2023-07-29 01:41:04 [main] [INFO ] o.e.Main [] - after client
2023-07-29 01:41:04 [main] [INFO ] o.e.Main [] - start spark
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SparkContext [] - Running Spark version 3.2.2
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceUtils [] - ==============================================================
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceUtils [] - No custom resources configured for spark.driver.
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceUtils [] - ==============================================================
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SparkContext [] - Submitted application: HelloWorldJava
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceProfile [] - Default ResourceProfile created, executor resources: Map(cores -> name: cores, amount: 1, script: , vendor: , memory -> name: memory, amount: 1024, script: , vendor: , offHeap -> name: offHeap, amount: 0, script: , vendor: ), task resources: Map(cpus -> name: cpus, amount: 1.0)
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceProfile [] - Limiting resource is cpu
2023-07-29 01:41:05 [main] [INFO ] o.a.s.r.ResourceProfileManager [] - Added ResourceProfile id: 0
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SecurityManager [] - Changing view acls to: liuxiaocs
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SecurityManager [] - Changing modify acls to: liuxiaocs
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SecurityManager [] - Changing view acls groups to: 
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SecurityManager [] - Changing modify acls groups to: 
2023-07-29 01:41:05 [main] [INFO ] o.a.s.SecurityManager [] - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(liuxiaocs); groups with view permissions: Set(); users  with modify permissions: Set(liuxiaocs); groups with modify permissions: Set()
2023-07-29 01:41:06 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'sparkDriver' on port 3010.
2023-07-29 01:41:06 [main] [INFO ] o.a.s.SparkEnv [] - Registering MapOutputTracker
2023-07-29 01:41:06 [main] [INFO ] o.a.s.SparkEnv [] - Registering BlockManagerMaster
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - BlockManagerMasterEndpoint up
2023-07-29 01:41:06 [main] [INFO ] o.a.s.SparkEnv [] - Registering BlockManagerMasterHeartbeat
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.DiskBlockManager [] - Created local directory at C:\Users\liuxiaocs\AppData\Local\Temp\blockmgr-20981c11-d805-40dc-81bd-8775f7ef74a1
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.m.MemoryStore [] - MemoryStore started with capacity 4.1 GiB
2023-07-29 01:41:06 [main] [INFO ] o.a.s.SparkEnv [] - Registering OutputCommitCoordinator
2023-07-29 01:41:06 [main] [INFO ] o.s.j.u.log [] - Logging initialized @7417ms to org.sparkproject.jetty.util.log.Slf4jLog
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.Server [] - jetty-9.4.44.v20210927; built: 2021-09-27T23:02:44.612Z; git: 8da83308eeca865e495e53ef315a249d63ba9332; jvm 1.8.0_291-b10
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.Server [] - Started @7493ms
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.AbstractConnector [] - Started ServerConnector@20999517{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}
2023-07-29 01:41:06 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'SparkUI' on port 4040.
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4ed15347{/jobs,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@34208baa{/jobs/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@6707a4bf{/jobs/job,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@f0a66bd{/jobs/job/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@1cf336fd{/stages,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@41ef1ea2{/stages/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@583fb274{/stages/stage,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@104dc1a2{/stages/stage/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@314a31b0{/stages/pool,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@59edb4f5{/stages/pool/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4735d6e5{/storage,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4dad0eed{/storage/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@164642a4{/storage/rdd,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@50b0afd7{/storage/rdd/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@62765aec{/environment,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@3a401749{/environment/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@27e2287c{/executors,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@2cd388f5{/executors/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@70d77826{/executors/threadDump,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4f169009{/executors/threadDump/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4207852d{/static,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@6cfbbff7{/,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@45b32dfe{/api,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@61874b9d{/jobs/job/kill,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@4f2d014a{/stages/stage/kill,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.a.s.u.SparkUI [] - Bound SparkUI to 0.0.0.0, and started at http://host.docker.internal:4040
2023-07-29 01:41:06 [main] [INFO ] o.a.s.e.Executor [] - Starting executor ID driver on host host.docker.internal
2023-07-29 01:41:06 [main] [INFO ] o.a.s.u.Utils [] - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 3033.
2023-07-29 01:41:06 [main] [INFO ] o.a.s.n.n.NettyBlockTransferService [] - Server created on host.docker.internal:3033
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManager [] - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManagerMaster [] - Registering BlockManager BlockManagerId(driver, host.docker.internal, 3033, None)
2023-07-29 01:41:06 [dispatcher-BlockManagerMaster] [INFO ] o.a.s.s.BlockManagerMasterEndpoint [] - Registering block manager host.docker.internal:3033 with 4.1 GiB RAM, BlockManagerId(driver, host.docker.internal, 3033, None)
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManagerMaster [] - Registered BlockManager BlockManagerId(driver, host.docker.internal, 3033, None)
2023-07-29 01:41:06 [main] [INFO ] o.a.s.s.BlockManager [] - Initialized BlockManager: BlockManagerId(driver, host.docker.internal, 3033, None)
2023-07-29 01:41:06 [main] [INFO ] o.s.j.s.h.ContextHandler [] - Started o.s.j.s.ServletContextHandler@286855ea{/metrics/json,null,AVAILABLE,@Spark}
2023-07-29 01:41:06 [main] [INFO ] o.a.s.SparkContext [] - Starting job: collect at Main.java:98
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Got job 0 (collect at Main.java:98) with 1 output partitions
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Final stage: ResultStage 0 (collect at Main.java:98)
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Parents of final stage: List()
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Missing parents: List()
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Submitting ResultStage 0 (ParallelCollectionRDD[0] at parallelize at Main.java:95), which has no missing parents
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.m.MemoryStore [] - Block broadcast_0 stored as values in memory (estimated size 3.1 KiB, free 4.1 GiB)
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.m.MemoryStore [] - Block broadcast_0_piece0 stored as bytes in memory (estimated size 1882.0 B, free 4.1 GiB)
2023-07-29 01:41:06 [dispatcher-BlockManagerMaster] [INFO ] o.a.s.s.BlockManagerInfo [] - Added broadcast_0_piece0 in memory on host.docker.internal:3033 (size: 1882.0 B, free: 4.1 GiB)
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.SparkContext [] - Created broadcast 0 from broadcast at DAGScheduler.scala:1478
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Submitting 1 missing tasks from ResultStage 0 (ParallelCollectionRDD[0] at parallelize at Main.java:95) (first 15 tasks are for partitions Vector(0))
2023-07-29 01:41:06 [dag-scheduler-event-loop] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Adding task set 0.0 with 1 tasks resource profile 0
2023-07-29 01:41:06 [dispatcher-event-loop-0] [INFO ] o.a.s.s.TaskSetManager [] - Starting task 0.0 in stage 0.0 (TID 0) (host.docker.internal, executor driver, partition 0, PROCESS_LOCAL, 4493 bytes) taskResourceAssignments Map()
2023-07-29 01:41:07 [Executor task launch worker for task 0.0 in stage 0.0 (TID 0)] [INFO ] o.a.s.e.Executor [] - Running task 0.0 in stage 0.0 (TID 0)
2023-07-29 01:41:07 [Executor task launch worker for task 0.0 in stage 0.0 (TID 0)] [INFO ] o.a.s.e.Executor [] - Finished task 0.0 in stage 0.0 (TID 0). 838 bytes result sent to driver
2023-07-29 01:41:07 [task-result-getter-0] [INFO ] o.a.s.s.TaskSetManager [] - Finished task 0.0 in stage 0.0 (TID 0) in 193 ms on host.docker.internal (executor driver) (1/1)
2023-07-29 01:41:07 [task-result-getter-0] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Removed TaskSet 0.0, whose tasks have all completed, from pool 
2023-07-29 01:41:07 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - ResultStage 0 (collect at Main.java:98) finished in 0.316 s
2023-07-29 01:41:07 [dag-scheduler-event-loop] [INFO ] o.a.s.s.DAGScheduler [] - Job 0 is finished. Cancelling potential speculative or zombie tasks for this job
2023-07-29 01:41:07 [dag-scheduler-event-loop] [INFO ] o.a.s.s.TaskSchedulerImpl [] - Killing all running tasks in stage 0: Stage finished
2023-07-29 01:41:07 [main] [INFO ] o.a.s.s.DAGScheduler [] - Job 0 finished: collect at Main.java:98, took 0.344019 s
[Hello,World, Hello,Spark, Hello,BigData]
org.apache.spark.SparkConf@489bc8fd
2023-07-29 01:41:07 [main] [INFO ] o.e.Main [] - end spark
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.SparkContext [] - Invoking stop() from shutdown hook
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.s.j.s.AbstractConnector [] - Stopped Spark@20999517{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.u.SparkUI [] - Stopped Spark web UI at http://host.docker.internal:4040
2023-07-29 01:41:07 [dispatcher-event-loop-1] [INFO ] o.a.s.MapOutputTrackerMasterEndpoint [] - MapOutputTrackerMasterEndpoint stopped!
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.s.m.MemoryStore [] - MemoryStore cleared
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.s.BlockManager [] - BlockManager stopped
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.s.BlockManagerMaster [] - BlockManagerMaster stopped
2023-07-29 01:41:07 [dispatcher-event-loop-1] [INFO ] o.a.s.s.OutputCommitCoordinator$OutputCommitCoordinatorEndpoint [] - OutputCommitCoordinator stopped!
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.SparkContext [] - Successfully stopped SparkContext
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.u.ShutdownHookManager [] - Shutdown hook called
2023-07-29 01:41:07 [shutdown-hook-0] [INFO ] o.a.s.u.ShutdownHookManager [] - Deleting directory C:\Users\liuxiaocs\AppData\Local\Temp\spark-a0570ce7-d735-471d-b7ae-fd94b16fbf98
```