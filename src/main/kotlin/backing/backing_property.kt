package backing

fun main() {

    var stupid = Stupid()

    stupid.addHobbies(listOf("Ufc","Ayush","Dank","India","Axe"))
    stupid.hobbies.forEach(::println)

//    stupid.hobbies.remove()

}

class Stupid{

    private var _hobbies = mutableListOf<String>()

    val hobbies:List<String>
        get() = _hobbies

    fun addHobbies(hobby:List<String>){
        _hobbies.addAll(hobby)
    }

}