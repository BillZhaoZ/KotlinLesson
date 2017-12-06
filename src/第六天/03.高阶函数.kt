package 第六天高阶函数和lambda表达式

/**
 * 函数作为参数或者函数和作为返回值就是高阶函数
 */
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var sum = 0
    var result = 0

//    sum = add(a, b)
//    result = sub(a, b)
//    println("sum=$sum result=$result")


    //调用高阶函数
    sum = cacl(a,b,::add)//传递add函数引用
    result = cacl(a,b,::sub)

    println("sum=$sum result=$result")
}
//定义一个函数 可以传递不同的函数 按照函数处理
//高阶函数
fun cacl(a:Int,b:Int,block:(Int,Int)->Int):Int{
    return block(a,b)
}

//求a+b的和
fun add(a:Int,b:Int):Int{
    return a+b
}
//求a-b差
fun sub(a:Int,b:Int):Int{
    return a-b
}

