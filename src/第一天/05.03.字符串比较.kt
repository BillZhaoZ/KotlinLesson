package 第一天基础

fun main(args: Array<String>) {
    /*---------------------------- 字符串比较 ----------------------------*/
    var s1 = "hello"
    var s2 = String(charArrayOf('h','e','l','l','o'))

    println(s1)
    println(s2)

    //判断s1和s2是否相等
    println(s1.equals(s2))
    println(s1==s2)//和equals一样
    println(s1===s2)//比较字符串引用地址

}