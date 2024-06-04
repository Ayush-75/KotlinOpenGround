fun main() {

    var a = 5.0
    var b = 6.0
    var height = 2.0

    val intouch = object : MyInterfaceN{

        init {
            println("I am from interface class")
        }
        override var name: String = "Ayush"

        override fun onTouch() {
            println(name)
        }
    }

    val parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("parallelogram created with a = $a,b = $b and height = $height")
            println("area is ${area()}")
            println("the perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }
    }
}

abstract class Shape(var name: String) {

    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("I am from abstract class")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
}

interface MyInterfaceN{


    var name:String

    fun onTouch()
}