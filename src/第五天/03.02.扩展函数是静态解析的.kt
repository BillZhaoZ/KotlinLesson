package 第五天面向对象加强

/**
 * 如果父类和子类都有扩展函数
 * 定义变量如果是父类类型 调用的是父类的扩展函数
 * 定义变量时子类类型  调用的就是子类的扩展函数
 */
open class View

class Button : View()
//给view定义了扩展函数
fun View.showOff() = println("I'm a view!")
//Button添加扩展函数
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view1: View = Button()
    val view2: Button = Button()
    view1.showOff()//I'm a view!
    view2.showOff()//I'm a button!
}