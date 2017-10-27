package 第四天面向对象

/**
 * 在init方法中保存传递的name和age信息
 */
fun main(args: Array<String>) {
    val person = Person4("张三",30)
    println(person)
}
class Person4(name: String, age: Int) {
    var name = ""
    var age = 10
    //当执行对象的构造函数时将成员变量赋值
    init {
        this.name = name
        this.age = age
    }
    override fun toString(): String {

        return "Person4(name=$name age=$age)"
    }
}
