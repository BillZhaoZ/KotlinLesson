package 第六天高阶函数和lambda表达式

fun main(args: Array<String>) {
    val result = {a:Int,b:Int->
        a+b
    }(10,20)
    println(result)
}