######Function literal / Anonymous function
Scala provides a relatively lightweight syntax for defining anonymous functions. The following expression creates a successor function for integers:
`(x: Int) => x + 1`
######Partially applied function
If a function literal consists of one statement that takes a single argument, you need not explicitly name and specify argument.