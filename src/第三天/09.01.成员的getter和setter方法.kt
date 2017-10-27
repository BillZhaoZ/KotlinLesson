package 第三天函数加强

/**
 * kotlin里面定义好成员变量之后  就已经默认实现了get和set方法
 */
fun main(args: Array<String>) {
    val person = Person1()

    //对name赋值
    person.name = "李四"
//    person.age = 30

    //访问了person的name字段
    println(person.name)
    println(person.age)
}
//Ctrl+Alt+L 代码格式化
class Person1 {
    //成员变量
    var name: String = "张三"
    val age = 30

//    fun getName():String{
//        return name
//    }
}
