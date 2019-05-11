package jwj

trait ParComputation[E] {
  def chunks(num: Int): List[ParComputation[E]]
}

final class ListParComputation[T](value: List[T]) extends ParComputation[T] {
  override def chunks(num: Int): List[ParComputation[T]] = {
    val slid = value.sliding(value.length / num, value.length / num).toList
    slid.map(new ListParComputation[T](_))
  }
}
