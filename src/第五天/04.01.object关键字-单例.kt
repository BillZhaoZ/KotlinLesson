package 第五天面向对象加强

/**
 * 单例指的是在内存中只有一个实例,我们在外面是不能直接new出这个对象
 * 一般情况下我们一些工具类可以做成单例的或者是静态的
 * 里面实现的逻辑是通过静态代码块的方式创建了一个Data的实例
 */
fun main(args: Array<String>) {
    Data.sayHello()
    Data.sayHello()
    Data.sayHello()
    Data.sayHello()
    Data.sayHello()

    println(Data.name)
}
//单例
//1.不能创建当前对象
//2.直接通过Data类.属性访问字段和函数
//3.object里面的字段是static静态变量
object Data{
    var name = "张三"
    fun sayHello(){
        println("hello 你好")
    }
}