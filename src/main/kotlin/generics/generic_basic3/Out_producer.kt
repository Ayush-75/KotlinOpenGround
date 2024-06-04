package generics.generic_basic3

import generics.generic_basic2.Android
import generics.generic_basic2.Phone

fun main() {

    val producerPhone: ProducerPhone<Phone> = ProducerPhone<Android>(Android())
}

//Covariant
// restricting it can only take subclass of phone
//only for producing i.e., returning only
class ProducerPhone<out T : Phone>(val phone: T) {

    // not allowed
//    var value:T = phone
    val value:T = phone

    // not allowed
//    fun getBodyType(another:T):T {
//        return phone
//    }

    fun get(): T {
        return phone
    }
}