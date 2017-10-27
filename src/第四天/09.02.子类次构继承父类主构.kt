/**
 * 通过子类的次构函数调用父类的主构函数
 */
fun main(args: Array<String>) {

}
open class Human(var name:String, var age:Int)
class Man1:Human{
    //通过次构函数调用父类的主构函数
    constructor(name:String,age:Int):super(name, age)//super指调用父类的构造函数
}

