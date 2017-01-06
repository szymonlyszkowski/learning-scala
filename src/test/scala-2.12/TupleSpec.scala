import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/6/17.
  */
class TupleSpec extends FlatSpec with Matchers{

  "Test" should "demonstrate tuple usage" in {
    val tuple = (1, "second tuple element")
    tuple._1 should equal (1)
    tuple._2 should equal ("second tuple element")
    val tupleWithExplicitType = Tuple2[Int, String](1,"second tuple element")
    var tupleWithExplicitTypeVar = new Tuple2[Int, String](1,"second tuple element")
//    tupleWithExplicitTypeVar._1 = 2 - THIS WILL COMPILER FAIL!
  }

}
