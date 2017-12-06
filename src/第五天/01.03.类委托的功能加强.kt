package 第五天面向对象加强

fun main(args: Array<String>) {
    val son = Son2()
    val father = SmallFather2(son)
    father.wash()
}
//洗碗能力
interface WashPower2{
    fun wash()
}

class Son2: WashPower2 {
    override fun wash() {
        println("大头儿子洗碗了")
    }
}
//小头爸爸也有洗碗能力了
class SmallFather2(var son:Son2):WashPower2 by son{
    override fun wash() {
        //洗完之前
        println("通知大头儿子洗碗了")
        //开始洗碗
        son.wash()
        //洗完之后
        println("大头儿子已经洗完了")
    }
}

