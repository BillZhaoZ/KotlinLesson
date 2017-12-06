package 第五天面向对象加强
//延迟加载 用到时再创建 不用
//只会创建一次
//线程安全  多个线程同时访问  也只会创建一次
val lazyValue by lazy { //最后一行是返回值
    println("执行了创建")
    "张三"
}
fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}