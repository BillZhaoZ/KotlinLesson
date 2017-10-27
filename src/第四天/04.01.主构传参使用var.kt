package 第四天面向对象

/**
 * 定义对象主构函数 可以通过var
 * 直接使用字段
 * 可以修改字段
 */
fun main(args: Array<String>) {
    val person = Person6("张三",20)
    println(person)
    person.name = "张四"
    println(person)
}
class Person6(var name: String,var age: Int) {
    override fun toString(): String {
        return "Person4(name=$name age=$age)"
    }
}
