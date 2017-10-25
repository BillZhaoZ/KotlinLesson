package haha

fun main(args: Array<String>) {
    val range1 = 1..10  //1 2  100
    //反向区间  10 9 8 7 651
//    val range2 = 10..1 错误的定义方式
    val range2 = 10 downTo 1  //反向区间
//    range2.forEach {
//        println(it)
//    }

    /*---------------------------- 区间的反转 ----------------------------*/
    val range3 = range1.reversed()//区间反转
    range3.forEach {
        println(it)
    }
}