package haha

fun main(args: Array<String>) {
    val range = 1..10
    //打印区间里面每一个数据
//    for (a in range){
//        println(a)
//    }
    //打印数据和角标
//    for ((index,a) in range.withIndex()){
//        println("index=$index a=$a")
//    }

    //高级for循环
//    range.forEach {//每一个元素it
//        println(it)
//    }
    //打印数据和角标
    range.forEachIndexed { index, i ->
        println("index=$index i=$i")
    }
}