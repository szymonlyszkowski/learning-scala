/**
  * Created by szymonidas on 1/6/17.
  */
class MaxFunction {
  def maxAlmostLikeJava(x: Int, y: Int): Int = {
    if (x > y) {
      return x
    }
    else {
      return y
    }
  }

  def maxWithoutCurlyBrackets(x: Int, y: Int): Int = {
    if (x > y)
      return x
    else
      return y
  }

  def maxWithoutReturnStatements(x: Int, y: Int) = {
    if (x > y)
      x
    else
      y
  }

  def maxWithoutElse(x: Int, y: Int) = {
    if(x>y)
      x
    y
  }

  def maxOneLiner(x: Int, y: Int) = if(x>y)x else y
}
