package 第三天函数加强
//函数里面定义函数
//内部函数可以访问外部函数变量
fun main(args: Array<String>) {
    var name = "张三"
    fun sayHello(age:Int){//嵌套函数  没有执行
        println("hello $name $age")
    }
    sayHello(30)//执行函数
}