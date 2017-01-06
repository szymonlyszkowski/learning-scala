import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/6/17.
  */
class ArraysSpec extends FlatSpec with Matchers{

  "Test" should "demonstrate Arrays usage" in {
    (1).+(2) should equal (3)
    1 + 2  should equal (3)
    val mutableArrayInitializedWithFactoryMethod = Array.apply(1,2,3)
    val mutableArrayInitializedWithSyntaticSugar = Array(1,2,3)
    mutableArrayInitializedWithFactoryMethod should equal (mutableArrayInitializedWithSyntaticSugar)
    val mutableArray = new Array[Int](3)
    mutableArray(1) = 2
    mutableArrayInitializedWithSyntaticSugar(1) should equal (mutableArray(1))
    mutableArray should not equal (mutableArrayInitializedWithSyntaticSugar)

    val listCreatedFromPrependMethod = 1 :: List(2,4)
    listCreatedFromPrependMethod should equal (List(1,2,4))
  }

}
