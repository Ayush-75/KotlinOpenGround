import kotlin.system.exitProcess

fun main() {

    val result = somerandomValue(5, 7).printValue()
//    result.printValue()
}
// expression body type
/*
In Kotlin, an expression body function is a concise way
to define a function when the function's body consists of a single expression.
 This allows you to define the function in a more compact and expressive manner.

 Expression body functions are commonly used for simple functions
 that can be defined concisely using a single expression.
 */
fun somerandomValue(a: Int, b: Int) = a + b

fun helok(x: Int, y: Int): Int {
    return 5

}


fun Int.printValue() {
    println(this)
}