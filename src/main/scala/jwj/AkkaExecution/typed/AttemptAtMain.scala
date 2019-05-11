package jwj.AkkaExecution.typed

import akka.actor.LightArrayRevolverScheduler
import akka.typed.ActorSystem
import akka.typed.scaladsl.Actor

import scala.concurrent.Future
import scala.io.StdIn

class AttemptAtMain {
//  def main(args: Array[String]): Unit = {
//    val work1 = Work(List(1, 2, 3, 4), i => i + 10)
//    val work2 = Work(List(1, 2, 3, 4), j => j * 2)
//
//    val root = Actor.deferred[Nothing] { ctx =>
//
//      import scala.concurrent.ExecutionContext.Implicits.global
//
//      implicit val scheduler = LightArrayRevolverScheduler(ctx.dispatcher)
//      val worker1 = ctx.spawn(WorkerNode.worker("worker-1"), "Worker1Actor")
//      val worker2 = ctx.spawn(WorkerNode.worker("worker-2"), "Worker2Actor")
//
//      ctx.ask
//      worker1 ! RequestWorkImpl(work1, ctx.self)
//      val fut1 : Future[WorkDone] = worker1 ? (RequestWorkImpl(work1, _))
//      val fut2 : Future[WorkDone] = worker2 ? (RequestWorkImpl(work2, _))
//
//      for {
//        res1 <- fut1
//        res2 <- fut2
//        _ <- println(res1.result ++ res2.result)
//      } yield ()
//
//      Actor.empty
//    }
//
//    val system = ActorSystem[Nothing](root, "Do shit")
//
//    try {
//      println("Press ENTER to exit the system")
//      StdIn.readLine()
//    } finally {
//      system.terminate()
//    }
}
