package collection

fun main(args: Array<String>) {

    var myMap = mapOf<Int,String>(5 to "Ayush", 6 to "UFC",7 to "Uma")



    for ((key,value) in myMap){
        println("key for $value : $key")
    }

    for (key in myMap.keys){
        println("$key : ${myMap[key]}")
    }

    myMap.forEach{ println("${it.key} : ${it.value}") }
}