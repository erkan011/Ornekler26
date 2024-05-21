class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Erkan", 22)
    val myString: Any = "Merhaba dünya"

    println("person nesnesi: ${getTypeMessage(person)}")
    println("myString nesnesi: ${getTypeMessage(myString)}")
}

private fun Any.getType(): Any {
    return this::class.java
}

private fun getTypeMessage(obj: Any): String {
    return when (obj.getType()) {
        String::class.java -> "Bu Bir Metin Dizesidir."
        Person::class.java -> {
            val person = obj as Person
            "Bu Bir Person Nesnesidir. Adı: ${person.name}, Yaşı: ${person.age}"
        }
        else -> "Bilinmeyen Tür"
    }
}
