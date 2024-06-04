package practice_again

import sealed_class.LoadState

fun main(args: Array<String>) {
    val people = People().some()
}

//Inheritor of sealed class or interface
// declared in package practice_again but it must be in package sealed_class where base class is declared
//object AnotherPackage:LoadState()

class People{

    lateinit var firstName:String
    lateinit var lastName:String

    constructor(){
        println("This is primary constructor")
    }

    constructor(first:String,last:String):this() {
        this.lastName = first
        this.firstName = last

        println("this is secondary constructor")
    }

    init {
        println("this is init value")
    }

    fun some(){
        if (this::firstName.isInitialized){
        println("Some random function $firstName")
    }
        else{
            println("first name is not initialized")
        }
    }
}