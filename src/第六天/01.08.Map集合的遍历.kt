package 第五天面向对象加强

fun main(args: Array<String>) {
    val map = mapOf("中国" to "China","英国" to "England")
    //Entry
//    for (entry in map) {
//        val key = entry.key
//        val value = entry.value
//        println("key=$key value=$value")
//    }

    //通过key和value方式遍历
//    for ((key,value) in map){
//        println("key=$key value=$value")
//    }

    //遍历key
//    for (key in map.keys){
//        println(key)
//    }

    //遍历value
//    for (value in map.values){
//        println(value)
//    }

    //通过迭代器
    val iterator = map.iterator()
    while (iterator.hasNext()){
        val next = iterator.next()
        val key = next.key
        val value = next.value
        println("key=$key value=$value")
    }
}