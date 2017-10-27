package 第四天面向对象

fun main(args: Array<String>) {
    val zhHuman = ZhHuman("张三",20)
    zhHuman.eat()

    val usHuman = USHuman("李四",30)
    usHuman.eat()
}
//人类 抽象类 不用open也可以被继承
abstract class Human(name:String,age:Int){
    //吃饭  人类不知道怎么实现
    abstract fun eat()  //abstract抽象  父类不知道具体实现  需要交个子类
}
class ZhHuman(name: String, age: Int) : Human(name, age) {
    //复写了父类的方法
    override fun eat() {
        println("用筷子吃饭")
    }
}
class USHuman(name: String, age: Int) : Human(name, age) {
    //复写了父类的方法
    override fun eat() {
        println("用刀叉吃饭")
    }
}

