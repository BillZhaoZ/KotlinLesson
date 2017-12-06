package 第五天面向对象加强

fun main(args: Array<String>) {
    hasRightOfInheritance(JonSnow())
}
//判断有没有继承权
fun hasRightOfInheritance(stark: Stark):Boolean{
    when(stark){
        is Stark.RobStark-> println("有继承权")
        is Stark.SansaStark-> println("有继承权")
        is Stark.AryaStark-> println("有继承权")
        is Stark.BrandonStark-> println("有继承权")
        is Stark.RobStark-> println("有继承权")
        else-> println("是私生子  没有继承权")
    }
    return false
}
//奈德·斯塔克
sealed class Stark{
    //罗伯·斯塔克
    class RobStark : Stark()

    //罗珊莎·斯塔克
    class SansaStark : Stark()

    //艾丽娅·斯塔克
    class AryaStark : Stark()

    //布兰登·斯塔克
    class BrandonStark:Stark()
}

//琼恩·雪诺
class JonSnow : Stark()

