fun main(args: Array<String>) {
    val number: Int = 56
    val bool: Boolean = true
    val double: Double = 5.99
    val tect: String = "some random text"
    val flow: Float = 56.85f

    var text: String = "5"
    val numberfromString: Int = Integer.parseInt(text)
    println(numberfromString)

    // type inference
    val example: String = "Number"+5
    println(example)
}