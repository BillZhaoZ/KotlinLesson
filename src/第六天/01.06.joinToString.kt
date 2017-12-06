package 第六天

fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五")
    println(list)//[张三, 李四, 王五]
    //按照(张三|李四|王五)打印
    val s = list.joinToString(separator = "|",prefix = "(",postfix = ")")
    println(s)

}