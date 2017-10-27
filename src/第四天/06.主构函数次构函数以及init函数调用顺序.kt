package 第四天面向对象

/**
 * 1.无论执行主构函数或者是次构函数 都会执行init方法
 * 2.调用次构函数 先执行init里面代码  再执行次构函数里面代码
 */
fun main(args: Array<String>) {
    //调用主构 执行init方法
//    val person1 = Person12("张三",20)
    //调用次构 执行init方法
    val person2 = Person12("张三",20,"1234456777")
}

class Person12(name: String, age: Int) {
    init {
        println("调用了init方法")
    }
    //主构函数
//定义次构函数
    constructor(name: String, age: Int, phone: String) : this(name, age){
        println("执行了次构函数")
    }
}
