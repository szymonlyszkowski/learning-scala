import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/8/17.
  */
class ChecksumAccumulatorSpec extends FlatSpec with Matchers{

  "Test" should "calculate checksum" in {
    val acc = new ChecksumAccumulator
    val testString = "TEST"
    testString.foreach(ch => acc.add(ch.toByte))
    acc.checksum() should equal (-64)
  }

  "Test checksum calculator companion object" should "calculate checksum" in {
    ChecksumAccumulator.calculate("TEST") should equal (-64)
  }

}
