package lambdas

fun main(args: Array<String>) {
    rollDice(1..6,5) { println(it) }
}

fun rollDice(
    range:IntRange,
    time:Int,
    callback:(Int)->Unit
){
    for (i in 0..<time){
        var result = range.random()
        callback(result)
    }
}