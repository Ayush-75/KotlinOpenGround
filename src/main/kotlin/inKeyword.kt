import java.util.Scanner

fun main(args: Array<String>) {
    val number = 72
    println(number in 0..72)

    // in keyword, it is case-sensitive
    // if t is capital T it will throw false
    println('t' in "Kotlin")
    println('t' in "KoTlin")

    println(isNotDigit(ch = 'a'))

//    println(isLowerCase('A'))
//    println(isUpperCase('a'))

//    whatCase()
//    extract()
    extractReadline()
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun isLowerCase(ch: String) = ch in "a".."z"

//fun isUpperCase(ch:Char)=ch in 'A'..'Z'
fun isUpperCase(ch: String) = ch in "A".."Z"

fun whiteSpace(ch: String) = ch in " "

fun Whitespace(char: Char): Boolean {
    val whitespaceChars = charArrayOf('\t', '\n', '\r', ' ')  // Define whitespace characters
    return char in whitespaceChars  // Check if the character is in the whitespace array
}

fun whatCase() {
    var a = readln()
    when {
        isLowerCase(a) -> println("Given character is lower case")
        isUpperCase(a) -> println("Given character is uppercase")
        else -> println("I don't know")
    }
}

fun extract() {
    var b = Scanner(System.`in`)
    println("Enter your Word")
    var c = b.nextLine()
    if (c.isBlank()) {
        println("Please enter some text")
    } else {
        for (elements in c) {
            when {
                isLowerCase(elements.toString()) -> println("$elements Given character is lower case")
                isUpperCase(elements.toString()) -> println("$elements Given character is uppercase")
//                whiteSpace(elements.toString()) -> print("\n")
//                elements.isWhitespace() -> println("\n")
                whiteSpace(elements.toString()) -> print("\n")
                else -> println("$elements is not word")

            }
        }
    }
}

fun extractReadline() {
    println("Enter your word")
    val input = readlnOrNull()

    for (char in input!!) {
        when {
            isLowerCase(char.toString()) -> println("$char Given character is lower case")
            isUpperCase(char.toString()) -> println("$char Given character is uppercase")
//                whiteSpace(elements.toString()) -> print("\n")
//                elements.isWhitespace() -> println("\n")
            whiteSpace(char.toString()) -> print("\n")
            else -> println("$char is not word")
        }
    }
}