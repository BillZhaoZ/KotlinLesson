package 第一天基础

/**
 * String  姓名
 * Int  年纪
 * String 手机号码
 *
 * 二元元组  Pair 保存两个数据
 * 三元元组 Triple 保存三个数据
 */
fun main(args: Array<String>) {
    //坦克大战
    val pair = Pair("张三",20)
    println(pair.first)
    println(pair.second)

    //三元元组
    val triple = Triple("李四",30,"134455")
    println(triple.first)
    println(triple.second)
    println(triple.third)

}
