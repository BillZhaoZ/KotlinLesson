package 第四天面向对象

fun main(args: Array<String>) {
    val person1 = Person3("张三",30)
    val person2= Person3("张三",30)
    val person3 = Person3("张三",30)
    val person4 = Person3("张三",30)
}
class Person3(name: String, age: Int) {
    //创建对象时 需要打印hello
    //对象初始化时会执行的操作
    init {//转换成java代码之后  这里面操作全部当道构造函数执行
        println("hello  又创建了一个人")
    }
}