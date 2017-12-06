package 第五天面向对象加强

/**
 * 扩展函数就让我们不需要再定义新的类而增加上新的方法
 */
fun main(args: Array<String>) {
    val human = HuMan()
    human.eat()
}
class HuMan
//定义吃饭方法
fun HuMan.eat(){
    println("开始吃饭了")
}


