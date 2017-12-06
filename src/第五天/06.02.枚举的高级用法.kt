package 第五天面向对象加强


fun main(args: Array<String>) {
    val zhagnsan = Person.张三
    zhagnsan.myName
    zhagnsan.age
}
//枚举里面不能传递name字段
enum class Person(var myName:String,var age:Int){
    张三("张三",20),
    李四("李四",30),
    王五("王五",40),
}

