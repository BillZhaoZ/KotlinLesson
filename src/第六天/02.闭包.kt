package 第六天高阶函数和lambda表达式
//js  go swift  python
fun main(args: Array<String>) {
    //闭包就让函数有了状态
    val t = test()
    t()
    t()
    t()
    test2()
    test2()
    test2()
}
fun test2(){
    var a = 10
    println(a)
    a++
}
fun test():()->Unit{
    var a = 10
    return {
        println(a++)
    }
}


