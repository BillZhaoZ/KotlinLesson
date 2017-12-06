package 第五天

fun main(args: Array<String>) {
//    val sin = Sinle()
    Sinle.single.sayHello()
}

//单例
//1.私有构造函数
//2.定义类的字段
//3.定义静态函数获取类的引用
class Sinle private constructor() {
    //私有构造函数
    var name = "张三"
    var age = 20

    companion object {
        //定义single  当使用时创建  只会创建一次  by lazy线程安全的
        val single by lazy { Sinle() }
    }

    fun sayHello(){
        println("hello")
    }
}