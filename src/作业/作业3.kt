package 作业

/**
 * 练习
 */
fun main(args: Array<String>) {

    /*// 1.when表达式
    var age = 15
    val result = todo(age)

    println(result)*/

    /* // 2.求a + b的和
     var a = 10
     var b = 5
     val add = add(a, b)
     println(add)*/

    // 3.异常处理
    var a = 20
    var b = 0

    try {//有可能出现异常的代码
        println(div(a, b))
    } catch (e: Exception) {
        //捕获异常并处理
        println("程序出现异常了 ${e.message}")
    } finally {
        //不管有没有异常 都会执行下面的代码
        println("执行了finally里面的代码")
    }

}

/**求a除b
 *
 */
fun div(a: Int, b: Int): Int {
    if (b == 0) {
//        println("不能除")
//        return 0
        //抛出异常
        throw Exception("分母为0了")
    } else {
        return a / b
    }
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//判断我们现阶段在做什么
fun todo(age: Int): String {
    //如果when表达式是上面这六种数据类型  最终都是转换为java的switch
    when (age) {
        7 -> return "加班"
        12 -> return "午休"
        15 -> return "吃饭"
        18 -> return "回家"
        else -> return "休闲"
    }
}
