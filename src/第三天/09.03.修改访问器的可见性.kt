package 第三天函数加强

fun main(args: Array<String>) {
    val person  = Person3()
//    person.name = "李四"
    println(person.name)
}
class Person3 {
    //只能访问字段 不能修改字段
    var name: String = "张三"
    private set//不能修改name
    //说明不能访问也不能修改
    private val age = 30



}
