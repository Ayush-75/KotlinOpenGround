package scopes

fun main(args: Array<String>) {

    val person: Person = Person()

    val num:String? = person?.run{
        println(name)
        println(age)
        age+5
        "Ayush"
    }
    println(person.age)



    println(num)
}
