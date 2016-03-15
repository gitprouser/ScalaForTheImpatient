import scala.util.Random
// p4
"crazy"*3
//p5
10 max 2 // RichInt scala
//p6
BigInt(2).pow(1024)
//p7
import BigInt.probablePrime
probablePrime(100, Random)
//p8
var i = 0
for(i <- 1 until 10)
  println (BigInt.probablePrime(100, Random).toString(36))
//p9
val str = "23rq7eubemstlyv5z1hh"
str.charAt(0)
str.charAt(str.length - 1)
//p10
str.take(3)
str.drop(6)
str.takeRight(3)
str.dropRight(str.length - 5)
