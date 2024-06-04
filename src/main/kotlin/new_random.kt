//fun main(args: Array<String>) {
//    var number =100
//    while (number>=0){
//        println(number)
//        number-=10
//    }
//}

// do while execute once even if the condition is false
fun main(args: Array<String>) {
    var number = 200
    do {
        println(number)
        number++

    }while (condition(number))
}

fun condition(number:Int) = number<=100

