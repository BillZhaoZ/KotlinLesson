package 第四天面向对象

fun main(args: Array<String>) {
    val person = Person("张三",20)
    println(person)

}
//通过构造方法传递name和age
class Person(name:String,age:Int)//主构函数

//class Person {
//    var name: String = "张三"
//    var age = 30
//    override fun toString(): String {
//        return "Person(name='$name', age=$age)"
//    }
//}
