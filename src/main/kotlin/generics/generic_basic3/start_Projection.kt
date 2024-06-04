package generics.generic_basic3

import printS
import java.util.Objects

fun main(args: Array<String>) {

    takeAny(listOf("Ayush", 5, Unit, takeAny(listOf("A")),5.4f))
}

fun takeAny(list: List<*>){
    println(list)
}