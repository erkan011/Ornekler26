//fun main() {
//    val myMap = mapOf("name" to "John", "age" to 30, "city" to "gaziantep")
//
//    for ((key, value) in myMap.entries) {
//        println("$key: $value")
//    }
//}

fun main() {
    val myMap = mapOf("name" to "John", "age" to 30, "city" to "Istanbul")

    val keyValuePairs = myMap.entries.map { Pair(it.key, it.value) }.toList()

    for (pair in keyValuePairs) {
        println("${pair.first}: ${pair.second}")
    }
}