package 第五天面向对象加强

fun main(args: Array<String>) {
    todo(Week.星期二)

    //将枚举里面数据遍历
    val values = Week.values()
    values.forEach {
        println(it)
    }
}
//枚举的初级用法
enum class Week{
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}
fun todo(week:Week){
    when(week){
        Week.星期一-> println("上班")
        Week.星期二-> println("上班")
        Week.星期三-> println("上班")
        Week.星期四-> println("上班")
        Week.星期五-> println("上班")
        Week.星期六-> println("打球")
        Week.星期日-> println("爬山")
    }
}

