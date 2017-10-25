package haha

fun main(args: Array<String>) {
//    sayHello()
//    sayHello("张三")
    val length = getNameLength("张三")
    println(length)
}

//没有参数没有返回值
fun sayHello(){//void 默认就是Unit
    println("hello")
}
//有参数没有返回值
fun sayHello(name:String){
    println("hello $name")
}
//有参数有返回值
fun getNameLength(name:String):Int{
    return name.length//求name字符串长度
}
//没有参数有返回值
fun haha():String{
    return "haha"
}