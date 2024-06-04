package com.ayush

import kotlin.random.Random

fun main(args: Array<String>) {

    var person1 = Person1("Ayush Private")
    person1.getNickname()
    // Cannot access 'getName': it is protected in 'Person1
//    person1.getName()

    // internal function
    person1.getName()


}

private class Person1(private val name:String) {

    private val nickname = "Ayush"

    init {

    }

//    protected fun getName(){
//        println("NAme -> $name")
//}
        internal fun getName(){
        println("NAme -> $name")
    }

    fun getNickname(){
        println("NickName -> $nickname")
        getName()
    }
}

class ModelTest()
    fun calculateTheNumberFrom0To100():Int{
        return Random.nextInt(from = 0, until = 100)
    }

// same name as class name in packageLook, error is not shown
// because package name is different
class Animal()