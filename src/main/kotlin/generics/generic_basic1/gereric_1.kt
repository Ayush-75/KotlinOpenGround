package generics.generic_basic1

fun main(args: Array<String>) {

    findElement(arrayOf("Ayush","Ufc","Axe","Jones"),"Ufc") { index, element ->
        println("Index $index")
        println("element $element")
    }
}

    fun<T> findElement(array:Array<T>,element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1,null)
    }

/*class ArrayUntil<T>(private val array: Array<T>) {
    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1,null)
    }
}*/
