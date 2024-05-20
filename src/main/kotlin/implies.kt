fun isAdult(age: Int) = age >= 18
fun canVote(age: Int, hasCriminalRecord: Boolean) = isAdult(age) implies (!hasCriminalRecord)

private infix fun Boolean.implies(other: Boolean) = !this || other


fun main() {
    val canJohnVote = canVote(24, false)
    val canJaneVote = canVote(22, true)
    println("canJohnVote : $canJohnVote")
    println("canJaneVote : $canJaneVote")
}