import scala.collection.mutable

/**
  * Created by szymonidas on 1/8/17.
  */
class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1

}

object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String) :Int = {
    if (cache.contains(s)) {
      cache(s)
    }
    else {
      val acc = new ChecksumAccumulator
      s.foreach(stringChar => acc.add(stringChar.toByte))
      val checksumCalculated = acc.checksum()
      cache += (s -> checksumCalculated)
      checksumCalculated
    }
  }

}
