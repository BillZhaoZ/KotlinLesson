
fun main(args: Array<String>) {
    val animal1:Animal = Dog()
    val animal2:Animal = Cat()

}

open abstract class Animal{
    abstract fun call()
}
class Dog: Animal() {
    override fun call() {
        println("汪汪汪")
    }
}
class Cat:Animal(){
    override fun call() {
        println("喵喵喵")
    }
}