package generics.generic_basic3

import generics.generic_basic2.Android
import generics.generic_basic2.Ios
import generics.generic_basic2.Phone

fun main(args: Array<String>) {

    //Contravariant
    // assign subclass to superclass with in keyword
    // same T or super type of T
    val consumerPhone: ConsumerPhone<Android> = ConsumerPhone<Phone>()
    consumerPhone.printPhone(Android())
}

class ConsumerPhone<in T>{
    fun printPhone(phone:T){
        println(phone.toString())
    }
}