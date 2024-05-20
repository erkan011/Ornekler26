import kotlin.contracts.contract

@OptIn(kotlin.contracts.ExperimentalContracts::class)
fun requireNotNull(value: Any?): Any {
    contract {
        returns() implies (value != null)
    }
    if (value == null) {
        throw IllegalArgumentException("Value Cannot be null")
    }
    return value
}

fun main() {
    val name = "Kotlin"
    val notNullName = requireNotNull(name)
    println(notNullName)
}
