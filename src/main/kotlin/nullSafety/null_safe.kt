package nullSafety

fun main(args: Array<String>) {


    lateinit var country:String
    val name:String? = null

    println("the length of name is ${name?.length}")

    name?.let {
        println("the length of name is ${name.length}")
    }

    val length = name?.length ?:-1
    println(length)

    println("the length of name is ${name!!.length}")
}