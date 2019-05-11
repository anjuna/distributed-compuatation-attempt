package jwj.AkkaExecution.typed

import akka.typed.scaladsl.Actor
import akka.typed.{ActorRef, Behavior}

class WorkerNode(name: String) extends Actor.MutableBehavior[WorkerNode.RequestWorkImpl]  {
  override def onMessage(msg: WorkerNode.RequestWorkImpl): Behavior[WorkerNode.RequestWorkImpl] = {
    case (_, WorkerNode.RequestWorkImpl(work, replyTo)) =>
      println("doing work on worker node " + name)

      val res = work.execute
      replyTo ! res

      println("replied after having done work")
      this
  }
}

object WorkerNode {

  case class Work(data: List[Int], fun: Int => Int)
  implicit class WorkOps(work: Work) {
    def execute: WorkDone = WorkDone(work.data.map(work.fun))
  }

  case class RequestWorkImpl(work: Work, replyTo: ActorRef[WorkDone])

  case class WorkDone(result: List[Int])

 def worker(workerName: String): Behavior[RequestWorkImpl] =
   Actor.mutable[RequestWorkImpl](_ => new WorkerNode(workerName))
}
