package haha

fun main(args: Array<String>) {
    val arr1 = arrayOf("张三","李四","王五")
    //for
//    for (any in arr1){
//        println(any)
//    }
//    for ((index,any) in arr1.withIndex()){
//        println("index=$index any=$any")
//    }
    //foreach
//    arr1.forEach {
//        println(it)
//    }
    arr1.forEachIndexed { index, s ->
        println("index=$index s=$s")
    }

}