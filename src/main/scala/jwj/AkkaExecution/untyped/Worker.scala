package jwj.AkkaExecution.untyped

import akka.actor.Actor

class Worker(name: String) extends Actor {
  import jwj.AkkaExecution.untyped.Model._

  override def receive: Receive = {
    case RequestWork(work) => sender() ! work.execute
  }
}
