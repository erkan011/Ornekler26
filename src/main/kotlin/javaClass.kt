fun main() {
    val list = java.util.ArrayList<String>()
    list.add("Hello")
    list.add("Word")
    println("liste: $list")


    val myClass = MyClass::class.java
    println("Class name: ${myClass.name}")

    val myObjet = Erkan()
    println("class name: ${myObjet.javaClass.name}")
}
class MyClass
class Erkan