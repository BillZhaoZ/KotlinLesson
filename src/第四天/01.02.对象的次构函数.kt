package 第四天面向对象

fun main(args: Array<String>) {
    val person = Person1("张三",5)
    val person1 = Person1("李四",30,"123456789")
}
class Person1(name:String,age:Int){//主构函数
    //定义次构函数
    constructor(name:String,age:Int,phone:String):this(name, age)//次构必须调用主构函数
}
