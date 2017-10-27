package 第四天面向对象

fun main(args: Array<String>) {
    val person = Person11("张三",20,"123456789")
    println(person)
}
//任何构造方法最终都要调用主构
//在次构中不能将参数加var或者val
//需要自己定义成员变量进行保存
class Person11(var name: String, var age: Int) {
    var phone=""
    //主构函数
//定义次构函数
    constructor(name: String, age: Int,phone: String) : this(name, age){
        this.phone = phone
    }

    override fun toString(): String {
        return "Person11(name='$name', age=$age phone=$phone)"
    }

}

