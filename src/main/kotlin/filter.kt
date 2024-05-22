fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)

    val oddNumbers = numbers.filterNot { it % 2 == 0 }
    println(oddNumbers)

    val filteredNumbers = numbers.filterIndexed {index, _ -> index % 2 == 0}
    println(filteredNumbers)
}