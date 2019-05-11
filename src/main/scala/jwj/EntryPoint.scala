package jwj


//Build up computation in an ADT, like IO/Task

//Represent worker nodes as in-memory instances of some class

//maybe actors? or maybe abstract over what execution/effect will occur... => tagless final?

//use fs2 Stream to fan out computation? serialize the work...

//Throw in some random failure's to these workers

//How to implement the DAG scheduler to deal with fault tolerance?

//Package a jar and invoke main? or something else?


object EntryPoint {

  def main(args: Array[String]): Unit = {
    val computation = new ListParComputation[Int](List.tabulate(10)(i => i + 1))
  }
}
