import java.util.Scanner

fun main(args: Array<String>) {

//    println("Enter your number")
//    var i = readln()
//    var number:Int = i.toInt()
//    greater(number)
//
//    var j = Scanner(System.`in`)
//    println("Enter your number")
//    var number2 = j.nextInt()
//    greater(number2)

    val number = checkNumberSign(8).printS()
//    println(number)
}

fun greater(i:Int){
    if (i<18) println("access denied")
//    if (i>18 || i==18) println("access approved")
    // better way
    if(i>=18) println("access approved")
}

fun checkNumberSign(number: Int):String{
    return if (number>0)
        "positive"
    else if (number<0)
        "negative"
    else
        "zero"
}

fun Any.printS(){
    println(this)
}