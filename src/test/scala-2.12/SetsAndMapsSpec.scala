import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

/**
  * Created by szymonidas on 1/8/17.
  */
class SetsAndMapsSpec extends FlatSpec with Matchers{

  "Test" should "demonstrate set usage" in {
    val immutableSet = Set(1,2,3)
    val mutableSet = mutable.Set(1,2,3)
    mutableSet += 4
    mutableSet.size should equal (4)
  }

  "Test" should "demonstrate map usage" in {
    val immutableMap = Map[Int, String](1 -> "First element", 2 -> "Second element")
    val mutableMap = mutable.Map[Int,String]()
    mutableMap += (3-> "element with key 3")
    //It is possible to pass a tuple which should be added to map
    mutableMap += ((4, "element with key 4"))
    mutableMap should equal (Map(3->"element with key 3", 4 -> "element with key 4"))
  }

}
