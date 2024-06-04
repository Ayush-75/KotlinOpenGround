package practice_again

interface ICardCashBack{
    fun getCashBackValue():Float
}

fun main(args: Array<String>) {

    var creditCardType = CreditCardType.GOLD
//    creditCardType.getCashBackValue()

    println("Enter your Card name")
    val name:String = readln().uppercase()
    val find: CreditCardType = CreditCardType.valueOf(name.uppercase())
//    println(CreditCardType.GOLD.name)
//    CreditCardType.entries.forEach { println(it) }

    when(CreditCardType.valueOf(name)){
        CreditCardType.SILVER -> println("Peter has silver credit card and your card limit is ${CreditCardType.valueOf(name).maxLimit}")
        CreditCardType.GOLD -> println("peter has gold credit card and your card limit is ${CreditCardType.valueOf(name).maxLimit}")
        CreditCardType.PLATINUM -> println("peter has platinum card and your card limit is ${CreditCardType.valueOf(name).maxLimit}")
    }
}

enum class CreditCardType(val color:String, val maxLimit:Int = 1000000 ):ICardCashBack{
    SILVER("silver",10000) {
        override fun getCashBackValue(): Float = 0.02f
    },
    GOLD("Gold") {
        override fun getCashBackValue(): Float = 0.04f
    },
    PLATINUM("Black") {
        override fun getCashBackValue(): Float = 0.06f
    }
}