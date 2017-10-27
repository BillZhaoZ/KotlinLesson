package 第四天面向对象

fun main(args: Array<String>) {
    val zhHuman = ZhHuman1("张三",20)
    println(zhHuman.licence)
}

//人类 抽象类
abstract class IHuman1(val name:String,val age:Int){
    abstract fun eat()
}
//中国人
class ZhHuman1(name: String, age: Int) : IHuman1(name, age),Ride,Drive{
    //复写接口中的字段
    override var licence: String = "小汽车驾照"

    override fun driveCar() {
        println("已经有了开汽车的能力")
    }

    override fun rideBike() {
        println("已经有了骑自行车的能力")
    }

    override fun eat() {
        println("用筷子吃饭")
    }
}
//人长大 会骑自行车了 能力 就可以通过接口实现
interface Ride{
    fun rideBike()//骑自行车的能力
}
//开汽车能力
interface Drive{
    //如果需要开车 就需要有一个驾照
    var licence:String
    //开汽车的能力
    fun driveCar()
}
