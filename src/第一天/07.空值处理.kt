package 第一天基础

/**
 * String  非空类型
 *String?  可空类型
 * Int 非空
 * Int? 可空
 */
fun main(args: Array<String>) {
    //可空类型
    var s:String? = null  //null空  Alt+Enter错题解决
    //将string字符串转换为int
//    s.toInt()//由于s是可空数据类型  直接调用,可能造成空指针 ,编译器不能编译通过
    //?.空安全调用符 如果s为空不执行后面toInt  不为空才执行 推荐大家使用第一种
//    s?.toInt()
    //!!.非空断言  告诉编译器我一定不为空 如果数据为空  运行还是会报错
//    s!!.toInt()

//    println(s?.toInt())

    //  Int 非空类型
    //  Int? 可空类型
    var a:Int = s?.toInt()?:-1//s不为空  s.toInt赋值给a  s为null  ?:后面的-1赋值给a
    println(a)
}

