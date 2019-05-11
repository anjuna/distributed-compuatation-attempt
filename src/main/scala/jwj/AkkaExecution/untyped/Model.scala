package jwj.AkkaExecution.untyped

object Model {
  case class Work(data: List[Int], fun: Int => Int)
  implicit class WorkOps(work: Work) {
    def execute: WorkDone = WorkDone(work.data.map(work.fun))
  }

  case class RequestWork(work: Work)

  case class WorkDone(result: List[Int])
}
