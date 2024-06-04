package lambdas

fun main(args: Array<String>) {

    var randomPerson = RandomPerson()

    with(randomPerson){
        name = "Axe"
        age = 24
    }

    randomPerson.apply {
        name = "Ayush"
        age = 24
    }.startRun()

    println(randomPerson.name)
    println(randomPerson.age)
}

class RandomPerson{
    var name:String = ""
    var age:Int = -1

    fun startRun(){
        println("Now I ready to run")
    }
}
