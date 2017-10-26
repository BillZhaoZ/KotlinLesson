package 第三天函数加强

fun main(args: Array<String>) {
    var name = "张三"
    var age = 20
//    sayHello(age = age)//具名参数
//    sayHello("李四",40)

    sayHello(age = 20,name ="王五")
}
fun sayHello(name:String="张三",age:Int){//默认参数
    println("hello  $name 你$age")
}


