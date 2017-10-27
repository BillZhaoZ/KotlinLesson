package 第四天面向对象

fun main(args: Array<String>) {
    val person = Person5("李四",30)
    println(person)
}
class Person5(name: String, age: Int) {
    var name = name
    var age = age

    override fun toString(): String {
        return "Person4(name=$name age=$age)"
    }
}
