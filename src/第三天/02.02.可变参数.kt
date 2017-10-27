package 第三天函数加强

fun main(args: Array<String>) {
    println(newAdd(1,2,3,30))
}
//求多个int数据类型和
fun newAdd(vararg params:Int):Int{//vararg可变参数 传递多个相同的数据类型 Int
    //kotlin智能类型推断
   //params 数组
    var sum = 0
    params.forEach {
        sum += it
    }
    return sum
}

