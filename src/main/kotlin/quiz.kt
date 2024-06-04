fun main() {
//    extract("Ayush ")
//    extract1("UFC ")
//    extract2("Axe ")
//    extract3("Indices ")
//    extract4("Element ")
//    extract5("while ")
//    extract6("do while ")

//    "For Each".forEach { println(it) }

    userInp()
}

/*
Print every element from a text
 */

fun userInp(){
    println("Enter your string : ")
    var mega = readln()
    for (i in mega.indices){
        println(mega[i])
    }
}

fun extract(text:String){
    val i = 0
    for (i in i..<text.length){
        println(text[i])
    }

}

fun extract1(text: String){
    for(i in 0 until text.length){
        println(text[i])
    }
}

fun extract2(text:String){
    for (i in 0..< text.length){
        println(text[i])
    }
}

fun extract3(text: String){
    for (i in text.indices){
        println(text[i])
    }
}

fun extract4(text: String){
    for (element in text){
        println(element)
    }
}

fun extract5(text: String){
    var i = 0
    while (i <  text.length){
        println(text[i])
        i++
    }
}

fun extract6(text: String){
    var i = 0
    do {
        println(text[i])
        i++
    }while (i<text.length)
}