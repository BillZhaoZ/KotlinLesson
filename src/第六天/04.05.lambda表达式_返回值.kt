package 第六天高阶函数和lambda表达式

/**
 * lambda表达式返回值不需要用return
 * 返回值是lambda表达式最后一行
 */
fun main(args: Array<String>) {
    val result = {
        println("hello")
        "你好"
        true
        20
    }()
    println(result)
}