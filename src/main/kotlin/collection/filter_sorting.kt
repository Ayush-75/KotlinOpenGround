package collection

fun main(args: Array<String>) {

    val myPredicate = {s:Int->s>10}

    val myNumber = listOf<Int>(5,3,4,64,3,10,14,8,9,3,5,7)

    val allCheck = myNumber.all (myPredicate)
    println(allCheck)

    val anyCheck = myNumber.any(myPredicate)
    println(anyCheck)

    val countCheck = myNumber.count(myPredicate)
    println(countCheck)

    val findCheck = myNumber.find(myPredicate)
    println(findCheck)

    val dist = myNumber.distinct()
    println(dist)



}


