package generics.generic_basic2

fun main() {

//    val myPhone = MyPhone(null) -> you can also pass null so be caution with generics
    // so give datatype to T(generics) like Any datatype or-> specific to class or object
    // its case-sensitive
    val myPhone = MyPhone(Ios())
    println(myPhone.isAndroidPhone())
}