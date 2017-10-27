/**
 * 1.复写父类的属性字段和方法  必须要将父类的字段和方法加上open
 * 2.子类里面字段和方法就需要加上override关键字
 */
fun main(args: Array<String>) {
    val son = Son1()
    println(son)
    son.sayHello()
}
open class Father2{
    //字段加上open关键字才能被复写
    open var name = "小头爸爸"
    open var age = 30
    //复写父类的方法
    open fun sayHello(){
        println("父亲hello")
    }
}
class Son1:Father2(){
    override var name: String = "大头儿子"
    override var age: Int =  10

    override fun sayHello() {
        //调用父类的sayHello方法
//        super.sayHello()
        println("儿子hello")
    }
    override fun toString(): String {
        return "Son1(name='$name', age=$age)"
    }

}
