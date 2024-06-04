package collection


fun main(args: Array<String>) {

    val list: List<Data> = listOf(Data(listOf("5","7","8")), Data(listOf("Hello","Ayuis","24")))

    val item = list.flatMap { it.items }.forEach(::println)


        val listOfLists = listOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9)
        )

    val listNormal = listOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9)
        ).flatten()

    listNormal.forEach{ println(it) }



        // Use flatMap to transform and flatten the lists
//        val flattenedList = listOfLists.flatMap { it.map { num -> num * 2 } }
        val flattenedList = listOfLists.flatMap { it}

        println("Flattened List: $flattenedList")
    }


class Data(val items:List<String>)