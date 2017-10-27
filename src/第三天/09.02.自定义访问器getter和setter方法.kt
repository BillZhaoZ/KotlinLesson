package 第三天函数加强

fun main(args: Array<String>) {
    val person = Person2()
    person.name = "李四"
    println(person.name)
}
class Person2 {
    var name: String = "张三"
    get() {
        println("找到名字了")
//        return name//不能返回name  栈内存溢出
        return field //filed代表就是name属性
    }
    set(value) {
        println("给name赋值了")
        field = value
    }

    val age = 30
}
