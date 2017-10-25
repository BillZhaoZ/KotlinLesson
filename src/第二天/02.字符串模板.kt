package haha

fun main(args: Array<String>) {
    /*---------------------------- 字符串模板 ----------------------------*/
    var name = "小吴"
    var place = "中国"
    val age = 20
    var job = "老师"

    val s = haha(name,place, age, job)
    println(s)
}
//自我介绍
fun haha(name:String,place:String,age:Int,job:String):String{
    return "我是$name 年纪$age 来自$place 工作是$job"
}
