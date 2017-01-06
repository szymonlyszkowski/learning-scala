import java.io.ByteArrayOutputStream

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by szymonidas on 1/6/17.
  */


class IntPrinterSpec extends FlatSpec with Matchers {
  "IntPrinter" should "print string using while loop" in {
    val stream = new ByteArrayOutputStream()
    val typeIntPrinter = new IntPrinter(stream)
    typeIntPrinter.printSequenceUsingWhileLoop(Seq(1, 2, 3))
    stream.toString should equal ("123")
  }

  "IntPrinter" should "print string using foreach & lambda" in {
    val stream = new ByteArrayOutputStream()
    val typeIntPrinter = new IntPrinter(stream)
    typeIntPrinter.printSequenceUsingFunctionLiteralInForeach(Seq(1, 2, 3))
    stream.toString should equal ("123")
  }

  "IntPrinter" should "print string using foreach withoutLambda" in {
    val stream = new ByteArrayOutputStream()
    val typeIntPrinter = new IntPrinter(stream)
    typeIntPrinter.printSequenceUsingPartiallyAppliedFunctionInForeach(Seq(1, 2, 3))
    stream.toString should equal ("123")
  }

  "IntPrinter" should "print string using for loop" in {
    val stream = new ByteArrayOutputStream()
    val typeIntPrinter = new IntPrinter(stream)
    typeIntPrinter.printSequenceUsingForLoop(Seq(1, 2, 3))
    stream.toString should equal ("123")
  }
}
