package 第三天函数加强

fun main(args: Array<String>) {
    var a =10
    var b = 20
    var sum = 0
//    sum = add(a, b)
//    println(sum)

    //函数和对象  一等公民
    //定义函数变量
    val addFun = ::add
    //::  获取add函数引用
//    sum = addFun(a, b)
    //第二种执行方式
//    sum = addFun.invoke(a, b)

    //定义函数变量 并且直接定义函数
    val addFun2:(Int,Int)->Int={a,b->a+b}
//    sum = addFun2(a,b)
    sum = addFun2.invoke(a,b)
    println(sum)
}
//求a+b和
//fun add(a:Int,b:Int):Int{
//    return a+b
//}
//如果函数体只有一行  可以简化
//fun add(a:Int,b:Int):Int = a+b
//不要返回值类型 函数表达式
fun add(a:Int,b:Int) = a+b

