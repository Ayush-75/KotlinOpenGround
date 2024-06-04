package generics.generic_basic2

// you can also pass null -> so give datatype to T(generics)
// specifying datatype to phone class restricting the types
// if you want it not to be case-sensitive set it os value to a lower case
class MyPhone<T : Phone>(val type: T) {

    fun isAndroidPhone() {
//        check(type.os == "android")
        check(type.os.lowercase() == "android")
        {
            "Os needs to be android"
        }
        println("Your phone is good to go")
    }
}