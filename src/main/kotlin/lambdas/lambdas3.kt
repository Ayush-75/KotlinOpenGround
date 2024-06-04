package lambdas

import printValue

fun main(args: Array<String>) {

    higherFunc(lambda)
    val fan = ::higherFunc
    fan{ println("Ayush") }

    calculator(5,7,::takeIt)
    calculator(5,7){a,b->a+b}
    val take = ::takeIt
    take(5,7).printValue()
    val make = moreTake().invoke(5,7).printValue()

}

val lambda = {
    println("This is higher order function")
}

fun takeIt(a:Int,b:Int):Int{
    return a+b
}

fun higherFunc(mySec:()->Unit){
    mySec()
}

fun calculator(a:Int,b:Int,myTake:(Int,Int)->Int){
    val result = myTake(a,b)
    println(result)
}

fun moreTake():((Int,Int)->Int){
    return ::takeIt
}