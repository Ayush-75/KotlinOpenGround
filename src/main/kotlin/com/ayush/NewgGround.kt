package com.ayush

fun main(args: Array<String>) {

    val name = ArrayElmn(arrayOf("Ayush", "Name"))

    val found = name.findElement("Name1")


}

class ArrayElmn<T>(val array: Array<T>) {
    fun findElement(element: T) {
        for (i in array.indices) {
            if (array[i] == element) {
                println("the element is ${array[i]} at this position $i")
                return
            }
        }
        println("the element is not found")
    }
}