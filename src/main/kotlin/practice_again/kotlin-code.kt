@file:JvmName("KotlinB")
package practice_again

fun main(args: Array<String>) {

    val area = Pavacode.getArea(5,7)

    println(area)

}

@JvmOverloads
fun volume(length:Int,breath:Int,height:Int = 10):Int{
    return length*breath*height
}

fun multiply(i:Int, j:Int):Int{
    return i*j
}