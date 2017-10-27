package 第三天函数加强

fun main(args: Array<String>) {
    val person = Person()
    println(person)
}
//8基本数据类型
//string字符串
//人 名字  年龄  地址
class Person{//人的类型
var name:String = "张三"
    var age = 30
    var place = "中国"
    override fun toString(): String {
        return "Person(name='$name', age=$age, place='$place')"
    }
    //tostring
    //Alt+Insert

}
