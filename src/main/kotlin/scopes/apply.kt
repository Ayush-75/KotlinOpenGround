package scopes

import java.util.*


fun main() {

    var name:String = "ayush"

    val stringLength = name?.let { it ->
        println(it.reversed())
        println(it.replaceFirstChar {take-> if (take.isLowerCase()) take.titlecase(Locale.getDefault()) else take.toString() })
        //or
        println(it.replaceFirstChar(Char::titlecase))
        println(it.replaceFirstChar(Char::uppercase))
        println(it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        it.length
    }

    println(stringLength)
}
class Person{
    var name = "Ayush"
    var age = 24
}


