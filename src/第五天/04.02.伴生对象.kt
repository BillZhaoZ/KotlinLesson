package 第五天面向对象加强

fun main(args: Array<String>) {
    //调用伴生对象里面方法
    MyData.sayHello()
    //调用伴生对象方法
    MyData.Inclass.sayHello()
}
class MyData{
    companion object Inclass{//伴生对象可以指定名
        fun sayHello(){
            println("伴生对象hello")
        }
    }
}

