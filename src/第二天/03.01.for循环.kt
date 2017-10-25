package haha

fun main(args: Array<String>) {
    val s = "我是中国人"
    //将字符串中所有的字符找到并打印
    for (f in s){//找到s字符串里面所有的字符 对应的就是c
        println(f)
    }
    //需要找到字符 并且还需要找到字符位置
    for ((i,f) in s.withIndex()){//将字符和角标同时遍历
        println("位置=$i 字符=$f")
    }
}
