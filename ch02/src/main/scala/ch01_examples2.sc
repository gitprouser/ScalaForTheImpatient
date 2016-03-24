import java.text.MessageFormat

//sum(1,2,3)
//
//println(1 to 5)

//def sum(args: Int*) = {
//  var result = 0
//  for (arg <- args) result += arg
//  result
//}
//
//val s = sum(1 to 3: _*)

//recursiveSum(1,2,3)
//recursiveSum(1 to 3 : _*)
//
//def recursiveSum(args: Int*) : Int = {
//  if (args.length == 0) 0
//  else {
//    println(args.head)
//    args.head + recursiveSum(args.tail : _*)
//  }
//}



//def decorate (str: String,
//              left: String = "[",
//              right: String  = "]") =
//  left + str + right
//
//decorate("hi", "[", "]")
//decorate("hello", "<<<<", ">>>>")


//val gayashGuys = List(("Krrish", 2), ("Ashwin", 34),
//  ("Dhawan", 29))
//
//for((name, age) <- gayashGuys)
//  printf("Hello, %s! you are %d years old\n", name, age)


//var n = 5
//var r = 1
//while( n > 0) {
//  r *= n
//  n -= 1
//  println(r + " " + n)
//}
//for (j <- 1 to n)
//  r *= j
//r
//for(s <- "Hello")
//  print(" " + s + " ")
//for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(i+  "" + j + " ")
//for(i <- 0 to 1; c <- "Hello") yield (c + i).toChar


//for(c <- "hal") {
//  print((c + 1).toChar)
//}

//
//
//val s = if (100 > 0) 1 else -1


//def fac(n : Int) = {
//  var r = 1
//  for ( i <- 1 to n) r *= i
//}


//val str = MessageFormat.format("The answer to {0} is {1}",
//  "well", 43.asInstanceOf[AnyRef])


//box("Dhawan Gajendran Gayash")
//box("MSIT-SE CMU")
//
//def box(s : String): Unit = {
//  val border = "+" + "-" * s.length + "+\n"
//  print(border + "|" + s  + "|\n" + border)
//}

//val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString