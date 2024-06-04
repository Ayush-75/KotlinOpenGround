package lambdas

import java.util.Objects


fun main(args: Array<String>) {
    val program = Program()

    program.addTwoNumbers(5,7)

    program.addTwoNumbers(5,7, object :MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    program.addTwoNumbers(5,7) { s,y -> s+y }

    program.biggerNumber(5,7){s,y -> if (s>y) println(s) else println(y) }

    program.reversedAndDisplay("Ayush") { println(it.reversed()) }
}

class Program{

    fun reversedAndDisplay(str:String,myFunc:(String)->Unit){
        myFunc(str)

    }

    fun biggerNumber(x: Int,y: Int,bigger:(Int,Int)->Unit){
        bigger(x,y)
    }

    fun addTwoNumbers(x: Int,y: Int,myAction:(Int,Int)->Int){
       var result = myAction(x,y)
        println(result)
    }

    fun addTwoNumbers(x:Int,y:Int){
        val sum = x+y
        println(sum)
    }

    fun addTwoNumbers(x: Int,y: Int,action:MyInterface) {
        val result = x+y
            action.execute(result)
//        println(result)
    }


}
interface MyInterface{
    fun execute(sum:Int)
}