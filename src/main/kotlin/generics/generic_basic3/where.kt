package generics.generic_basic3

fun main(args: Array<String>) {

    hireDeveloper(AndroidDevelopers("Ayush"))
//    hireDeveloper(IosDeveloper("Axe"))
//    hireDeveloper(WebDeveloper("Ayu"))
}

fun <T> hireDeveloper(developer: T) where T:Developer,T:PriorExperience{
    println("Hired ${developer.name}")
}

abstract class Developer{abstract val name:String}

class AndroidDevelopers(override val name: String):Developer(),PriorExperience{
    override fun getPriorExperience() {
        println("Worked at Google for 5 years")
    }
}

class IosDeveloper(override val name: String):Developer()
class WebDeveloper(override val name: String):Developer()

interface PriorExperience{
    fun getPriorExperience()
}