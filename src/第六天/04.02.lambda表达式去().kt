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



    //通过lambda表达式调用高阶函数
    //匿名函数
    //如果lambda表达式在最后一个参数位置  可以简化
    sum = cacl2(a,b){a,b->
        a+b
    }//传递add函数引用
    result = cacl2(a,b){a,b->
        a-b
    }

    println("sum=$sum result=$result")
}
//定义一个函数 可以传递不同的函数 按照函数处理
//高阶函数
fun cacl2(a:Int,b:Int,block:(Int,Int)->Int):Int{
    return block(a,b)
}
