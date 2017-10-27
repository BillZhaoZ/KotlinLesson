package 第四天面向对象

fun main(args: Array<String>) {
    val person = Person7("张三",20)
    println(person)

}

/**
 * 构造函数参数val修饰
 * 可以使用字段
 * 不能修改字段
 */
class Person7(val name: String,val age: Int) {
    override fun toString(): String {
        return "Person4(name=$name age=$age)"
    }
}
