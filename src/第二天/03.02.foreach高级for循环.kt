package haha

fun main(args: Array<String>) {
    val s = "我是中国人"
    //将所有的字符打印
    s.forEach {
        println(it)//it代表每一个字符
    }
    //将角标和字符打印
    s.forEachIndexed { index, c ->//先不用管  index 角标  c字符
        println("角标=$index 字符=$c")
    }
}