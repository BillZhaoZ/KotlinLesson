
fun main(args: Array<String>) {
    val son = Son()
    son.name = "儿子"
    son.age = 20
    println(son.name)
    println(son.age)
    son.sayHello()


}
//class  默认不能被继承
open class Father{
    var name:String = "父亲"
    var age:Int = 40
    fun sayHello(){
        println("父类hello")
    }
}
class Son:Father(){

}

