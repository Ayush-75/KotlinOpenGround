fun main() {
    val range = (1..10)
    val range2 = (0 until 10)

    showRange(range = 1..3)
    showRange(range = 3 downTo 1)
    showRange(range = 0..10 step 2)
    showRange(range = 9 downTo 0 step 3)

    for (character in "Jnskhm "){
        print(character+1)
    }

    repeat(3){
        println("\nKotlin is the best")
    }
}

fun showRange(range:IntProgression){
    for (number in range){
        print(" Current number: $number")
    }
    print("// $range")
    println()
}