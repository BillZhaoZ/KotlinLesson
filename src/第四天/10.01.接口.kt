/**
 * 1.抽象类:事物的共同特性 代表的就是事物的本质  一个类只能继承一个抽象类
 * 2.接口:代表的是事物具备的能力 能力可以多继承
 */
fun main(args: Array<String>) {
    val zhHuman = ZhHuman1("张三",20)
    zhHuman.rideBike()
    zhHuman.driveCar()
}

//人类 抽象类
abstract class IHuman1(val name:String,val age:Int){
    abstract fun eat()
}
//中国人
class ZhHuman1(name: String, age: Int) : IHuman1(name, age),Ride,Drive{
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
    //开汽车的能力
    fun driveCar()
}


