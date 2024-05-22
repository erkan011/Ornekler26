

//import kotlin.time.Duration
//import kotlin.time.Duration.Companion.seconds
//
//fun main() {
//    val duration: Duration = 5.seconds
//    println("Duration in seconds: ${duration.inWholeSeconds}")
//}

fun main() {
    val duration = java.time.Duration.ofSeconds(5)
    println("Duration in seconds: ${duration.seconds}")
}

