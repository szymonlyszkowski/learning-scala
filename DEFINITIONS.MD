######Function literal / Anonymous function
Scala provides a relatively lightweight syntax for defining anonymous functions. The following expression creates a successor function for integers:
`(x: Int) => x + 1`
######Partially applied function
If a function literal consists of one statement that takes a single argument, you need not explicitly name and specify argument.
`args.foreach(println)`
######Arrays
All arrays in scala are mutable! Arrays are initialized using _factory method_ **apply**
```
val array = Array(1,2,3) <==> val array = Array.apply(1,2,3)
array(1) = 90 //can be modified
val arrayLongerInitialization = new Array[Int](3)
```