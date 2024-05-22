data class User(val id: Int, val name: String?)

fun getUserById(id:Int): User {
    return User(id, "Erkan")
}
fun <T : Any> requireNotNull(value: T?, lazyMessage: () ->Any): T{
    if (value == null){
        throw IllegalArgumentException(lazyMessage().toString())
    }else{
        return value
    }
}
fun main() {
    val user = getUserById(1)
    val userName = requireNotNull(user.name) {"user name cannot be null"}
    println("userName: $userName")
}