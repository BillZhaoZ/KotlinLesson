/**
 * 通过子类的主构函数调用父类的主构函数
 */
fun main(args: Array<String>) {

}
open class Human1(var name:String,var age:Int)
//父类主构有参数  子类继承必须要传递给父类
class Man(var newName: String,var  newAge: Int) : Human1(newName, newAge) {

}

