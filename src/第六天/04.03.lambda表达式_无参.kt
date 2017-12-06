package 第六天高阶函数和lambda表达式

fun main(args: Array<String>) {
    //无参的lambda表达式
    {
        println("hello")
    }()//执行了lambda表达式
    hello()
}
val hello = {
    println("out hello")
}


