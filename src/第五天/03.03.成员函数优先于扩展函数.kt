package 第五天面向对象加强

/**
 * 如果成员函数和扩展函数都有同样的函数
 * 调用的时候是调用成员函数
 */
class C1 {
    //成员函数
    fun testFun() {
        println("成员函数 C1")
    }
}

//拓展函数
fun C1.testFun() {
    println("拓展函数 C1")
}

fun main(args: Array<String>) {
    var c = C1();
    c.testFun()
}