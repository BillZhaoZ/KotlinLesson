package haha
//多分支判断语句switch  int byte  char short 枚举 string
//when表达式比switch强大
fun main(args: Array<String>) {
    //7->上小学
    //12 上初中
    //15 高中
    //18 大学
    var age = 30
    val result = todo(age)
    println(result)
}
//判断我们现阶段在做什么
fun todo(age:Int):String{
    //如果when表达式是上面这六种数据类型  最终都是转换为java的switch
    when(age){
        7->return "开始上小学"
        12->return "开始上中学"
        15->return "开始上高中"
        18->return "开始上大学"
        else->return "在上社会大学"
    }
}

