package 第三天函数加强

/**
 * 尾递归优化:将递归转换为迭代来实现
 * 尾递归:函数里面调用当前函数 没有做其他任何处理就是尾递归
 */
fun main(args: Array<String>) {
//    println(sum3(100000))
    println(sum4(100000,0))
}
//100  1+2+3+4+5+6
//通过迭代的方式求1到n和
//fun sum3(n:Int):Int{
//    val range = 1..n
//    var result = 0
//    range.forEach {
//        result+=it
//    }
//    return result
//}

//通过递归的方式实现上面的求和
//迭代需要消耗大量的内存空间  迭代的层级很多 就会造成栈内存溢出
//尾递归
//尾递归优化 tailrec
tailrec fun sum4(n:Int,result:Int):Int{
    if(n==1)return result+1
    return sum4(n-1,result+n)
}
