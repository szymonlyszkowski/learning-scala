import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/6/17.
  */
class MyFirstScalaFunctionSpec extends FlatSpec with Matchers {

  "Max function" should "return higher number" in {
    new MaxFunction().maxAlmostLikeJava(5, 3) == 5
    new MaxFunction().maxWithoutCurlyBrackets(5, 3) == 5
    new MaxFunction().maxWithoutReturnStatements(5,3) == 5
    new MaxFunction().maxWithoutElse(5,3) == 5
    new MaxFunction().maxOneLiner(5,3) == 5
  }

}
