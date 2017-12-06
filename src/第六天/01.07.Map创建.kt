package 第五天面向对象加强

/**
 * map相当于是词典 有键值对
 * map的key不能重复
 */
fun main(args: Array<String>) {
    //创建map集合
    val map = mapOf("张三" to 20,"李四" to 30,"王五" to 10)
    println(map)
    //通过key值获取value值
    val age = map.get("李四")
    println(age)

    val map2 = mutableMapOf("张三" to 20,"李四" to 30,"王五" to 10)
    map2.put("赵六",40)
    map2.put("赵六",40)
    println(map2)

    //使用java的map集合
    val hashMap = HashMap<String,Int>()
    hashMap.put("张三",20)
    hashMap.put("张三",20)
    hashMap.put("张三",20)
    hashMap.put("张三",20)
}