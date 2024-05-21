fun main() {
    val x: Any =10
    if (x is Int){
        x.setType()
        println(x.javaClass)
        println(x)
    }
}
private fun Any.setType(): Any {
    return this::class.java
}