package generics.generic_function

import generics.generic_basic2.Android
import generics.generic_basic2.Ios
import generics.generic_basic2.Phone

fun main(args: Array<String>) {
    val ownerPhone = OwnerPhone<Android>(Android())
    printOs(ownerPhone)

   println("Os is type of Ios:${ownerPhone.phone.hasPhoneType<Ios>()}")
   println("Os is type of Ios:${ownerPhone.smartPhoneType<Ios>()}")
}

fun <T:Phone>printOs(ownerPhone: OwnerPhone<T>){
    println(ownerPhone.phone.os)
}

// generic extension function

inline fun <reified T:Phone> Phone.hasPhoneType() = this is T

//inline fun <reified R:Phone> OwnerPhone<Android>.smartPhoneType() = this is R
inline fun <reified R:Phone> OwnerPhone<*>.smartPhoneType() = this is R
//

class OwnerPhone<T:Phone>(val phone: T){
    fun get():T{
        return phone
    }
    

//    inline fun <reified R:Phone> hasPhoneType(): Boolean = phone is R
}