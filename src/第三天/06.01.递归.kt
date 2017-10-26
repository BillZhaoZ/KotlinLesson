package 第三天函数加强
//包子馅的包子  最后就是馒头
//递归和迭代其实是相通
fun main(args: Array<String>) {
//    println(fib(9))
//    println(sum1(10))
    println(sum2(10))
}
//斐波那契数列  1 1 2 3 5 8 13 21 34 ....
//求第n个斐波那契数列
fun fib(n:Int):Int{
    if(n==1) return 1
    if(n==2) return 1
    return fib(n-1)+ fib(n-2)
}
//100  1+2+3+4+5+6
//求1到n和
fun sum1(n:Int):Int{
    val range = 1..n
    var result = 0
    range.forEach {
        result+=it
    }
    return result
}

//通过递归的方式实现上面的求和
fun sum2(n:Int):Int{
    if(n==1)return 1
    return n+ sum2(n-1)
}

