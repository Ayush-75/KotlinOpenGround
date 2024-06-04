package model1

// if the name is too big, or you want different Name, you can
//  assign a new name for specific for this class
import com.ayush.calculateTheNumberFrom0To100 as randomNumber

fun main(args: Array<String>) {
    var result = randomNumber()
    println(result)
}

// same name as class name in oops1.kt, error is not shown
//  because the package name is different
class Animal()