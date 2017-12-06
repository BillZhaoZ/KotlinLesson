package 第五天面向对象加强

fun main(args: Array<String>) {
    val father = SmallFather()
    father.wash()
}
//洗碗能力
interface WashPower1{
    fun wash()
}
//大头儿子已经具备了洗碗能力
class Son1:WashPower1{
    override fun wash() {
        println("大头儿子洗碗了")
    }
}
//小头爸爸把洗碗的能力委托给大头儿子了
class SmallFather:WashPower1 by Son1(){
}



