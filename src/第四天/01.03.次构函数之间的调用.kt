package 第四天面向对象

/**
 * 次构函数必须调用主构
 * 次构函数间可以项目调用
 */
fun main(args: Array<String>) {
    //定义一个有号码和邮箱人
    val person = Person2("王五",30,"12345678","434324432@qq.com")
}

class Person2(name: String, age: Int) {
    //主构函数
//定义次构函数
    constructor(name: String, age: Int, phone: String) : this(name, age)//次构必须调用主构函数
    constructor(name:String,age:Int,phone:String,email:String):this(name, age,phone)//调用上面的次构函数
}