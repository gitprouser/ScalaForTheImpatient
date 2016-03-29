import java.lang.Character.UnicodeBlock
//************************************************/
//                    Exc 1
//************************************************/
//signum(12)
//signum(0)
//signum(-1233)
//
//def signum(x: Int) = {
//  if (x < 0 ) -1
//  else if (x > 0) 1
//  else 0
//}


//************************************************/
//                    Exc 2
//************************************************/
// {}   // value = () and type = Unit

//************************************************/
//                    Exc 3
//************************************************/
/**
 * TODO: Throws an error in the scala compiler
 *       Unable to find a genuine usecase for this.
 *
var x: {}
var y: Int = 1
x = y = 2
*/

//************************************************/
//                    Exc 4
//************************************************/
// Convert to scala :
// for (int i = 10; i >= 0; i--) System.out.println(i)
//for (i <- 10 to (0, -1)) println(i)

//************************************************/
//                    Exc 5
//************************************************/
//  Write a procedure countdown(n : Int) that prints the
// numbers from n to 0?
//def countdown(n : Int): Unit = {
//  for(i <- n to (0, -1)) println(i)
//}
//countdown(10)

//************************************************/
//                    Exc 6
//************************************************/
//def getUni(s:Char*): Int = {
//  if (s.length == 0) 1
//  else s.head.toInt * getUni(s.tail:_*)
//}


var res:Long = 1
for(c <- "Hello") {
  res *= c.toLong
}
println (res + "L")
//************************************************/
// Exc 7
// Solve the preceding exercise without writing 
// a loop.
//************************************************/
val res7 = "Hello".foldLeft(1L)((b,a) => b*a)
println(res7 + "L")
//************************************************/
// Exc 8
//************************************************/
println(product("Hello"))
def product(s: String): Long = {
    var res8 : Long = 1 
    for(c <- s) res8 *= c.toLong
    res8
}

//************************************************/
// Exc 9
//************************************************/
println(prodRec("Hello", 1L))
def prodRec(s : String, acc : Long) : Long = {
    if (s.length == 0) acc 
    else prodRec(s.drop(1), s.charAt(0).toLong * acc)
}
//************************************************/
// Exc 10
//************************************************/
/**
 * Write a function that computes x^n, where n is an integer.
 * Use the following recursive definition: 
 *  x^n = y^2 if n is even and positive where y = x^n/2
 *  x^n = x.x^(n-1) if n is odd and positive
 *  x^0 = 1
 *  x^n = 1/[x ^ -n] if n is negative
 */
println(compute(12, 10))
def compute(x : BigDecimal, n : Int) : BigDecimal = {
    if (n == 0)  {  println("ExitLoop  " + "x=" + x + " n=" + n) ; 1 }
    else {
        println("Outer  " + "x=" + x + " n=" + n)
        if (n < 0)  1/compute(x, -n)
        else {
            if (n % 2 == 0 && n > 2) {
                println("Inner2  " + "x=" + x + " n=" + n)
                val res = compute(compute(x, n / 2), 2)
                println("*" * 5)
                println("*" * 5 + "Inner2 result=" + res)
                println("*" * 5)
                res
            } else {
                println("Inner1  " + "x=" + x + " n=" + n)
                val res = x * compute(x, n - 1)
                println("*" * 5)
                println("*" * 5 + "Inner1 Result=" + res)
                println("*" * 5)
                res
            }
        }
    }
}
