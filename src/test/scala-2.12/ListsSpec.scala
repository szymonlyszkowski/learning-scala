import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/6/17.
  */
class ListsSpec extends FlatSpec with Matchers{

  "Test" should "demonstrate List usage" in {
    val shortest = List(1,2,3)
    val factoryMethod = List.apply(1,2,3)
    val concatenatedList = shortest ::: factoryMethod
    concatenatedList should equal (List(1,2,3,1,2,3))
    concatenatedList should not be theSameInstanceAs (List(1,2,3,1,2,3))
    val emptyList = Nil
    emptyList should be theSameInstanceAs (Nil)
  }

}
