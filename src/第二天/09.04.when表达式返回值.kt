package haha

fun main(args: Array<String>) {

    var age = 7
    val result = todo4(age)
    println(result)
}
//判断我们现阶段在做什么
fun todo4(age:Int):String {
    //如果when表达式是上面这六种数据类型  最终都是转换为java的switch
    val result = when (age) {
        7 -> {//返回值是最后一行
            println("haha  你正在上小学")
            "开始上小学"
            "发老师发来撒拉夫劳伦雷锋雷锋 "
        }
        12 -> "开始上中学"
        15 -> "开始上高中"
        18 -> "开始上大学"
        else -> "在上社会大学"
    }
    return result
}

