package jwj

import fs2.Stream

object StreamScheduler {
  def schedule[E, R](parComputation: ParComputation[E], fun: E => R): ParComputation[R] = {

    //get executors

    //send chunked computation with work fun

    //do something??


    ???
  }
}
