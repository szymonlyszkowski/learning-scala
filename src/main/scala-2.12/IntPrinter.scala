import java.io.OutputStream

import scala.Console._

/**
  * Created by szymonidas on 1/6/17.
  */

class IntPrinter(stream: OutputStream) {
  def printSequenceUsingForLoop(sequence: Seq[Int]) = {
    Console.setOut(stream)
    for (element <- sequence) print(element)
  }

  def printSequenceUsingForeach(sequence: Seq[Int]) = {
    Console setOut (stream)
    sequence.foreach(print)
  }


  def printSequenceUsingLambdaInForeach(sequence: Seq[Int]) = {
    Console.setOut(stream)
    sequence.foreach(s => print(s))
  }

  def printSequenceUsingWhileLoop(sequence: Seq[Int]) = {
    Console.setOut(stream)
    var index = 0
    while (index < sequence.size) {
      val tmp = sequence(index)
      print(sequence(index) toString)
      index += 1
    }
  }
}
