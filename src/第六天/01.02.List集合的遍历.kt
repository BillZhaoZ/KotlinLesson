package 第五天面向对象加强

fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五")
    //遍历
//    for (s in list) {
//        println(s)
//    }

    //加上角标的打印
//    for ((index,s) in list.withIndex()) {
//        println("index=$index s=$s")
//    }

//    foreach

//    list.forEach {
//        println(it)
//    }

    //通过foreach打印角标
    list.forEachIndexed { index, s ->
        println("index=$index s=$s")
    }
}