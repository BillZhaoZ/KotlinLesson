package haha

fun main(args: Array<String>) {
    var age = 30
    val result = todo2(age)
    println(result)
}
//判断我们现阶段在做什么
fun todo2(age:Int):String{
    //如果数据类型不是java对应的6中数据类型 最终转换为java的if else语句来实现
    when(age){
        7->return "开始上小学"

//        8->return "正在上小学"
//        9->return "正在上小学"
//        10->return "正在上小学"
//        11->return "正在上小学"
        //多个结果处理
//        8,9,10,11->return "正在上小学"
        //更加简化
        in 8..11->return "正在上小学"
        12->return "开始上中学"
        13,14->return "正在上中学"
        15->return "开始上高中"
        16,17->return "正在上高中"
        18->return "开始上大学"
        //is是什么类型  instanceof
        is Int->return "是int数据类型"
        else->return "在上社会大学"
    }
}
