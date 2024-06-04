package backing

fun main(args: Array<String>) {

    var human = Human()
    human.age = 12
    println(human.age)

    human.name = "ayush"
    println(human.name)
}

class Human{

    var name:String = ""
        set(value) {
            field = value.uppercase()
        }


    var age:Int? = null
        get() {
//            println(field)
            return field
        }
        set(value) {
           if (value?.compareTo(18)!! <0)
               println("you are minor")
            else
                field = value
        }
}