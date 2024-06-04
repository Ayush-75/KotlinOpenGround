package sealed_class

fun main(args: Array<String>) {

    val shape = arrayOf(Circle(2.0), Triangle(5.0,4.0), Square(5.0), Rectangle(5.0,4.0))

    calculateArea(shape)

    val circle = Circle(5.0)
    circle.area()
}

fun calculateArea(shapes:Array<Shape>){
    for (shape in shapes){
        val className = shape::class.simpleName
        println("area of $className is ${shape.area()}")
    }
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val sides: Double) : Shape() {
    override fun area(): Double {
        return sides * sides
    }
}

class Rectangle(val l: Double, val b: Double) : Shape() {
    override fun area(): Double {
        return l * b
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

data object AnotherOne : LoadState()