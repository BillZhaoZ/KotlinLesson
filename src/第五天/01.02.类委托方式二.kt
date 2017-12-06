package 第五天面向对象加强

fun main(args: Array<String>) {
    val son = Son()
    val father = SmallFather1(son)
    father.wash()
}

//洗碗能力
interface WashPower{
    fun wash()
}

class Son: WashPower {
    override fun wash() {
        println("大头儿子洗碗了")
    }
}
//小头爸爸也有洗碗能力了
class SmallFather1(var son:Son):WashPower by son
