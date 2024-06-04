package generics.random_genrics

fun main(args: Array<String>) {

    val creator = Compare<Int, String>(
        listOf(1, 2, 3, 4, 5),
        listOf("One", "Two", "Three", "Four", "Five")
    ).apply {
        println(this.getMap())
    }


}

class Compare<T, K>(
    private val list1: List<T>,
    private val list2: List<K>
) {
    fun getMap(): Map<T, K>? {
        if (list1.size != list2.size) return null
        val map = mutableMapOf<T, K>()
        list1.forEachIndexed { index, item ->
            map[item] = list2[index]
        }
        return map
    }
}