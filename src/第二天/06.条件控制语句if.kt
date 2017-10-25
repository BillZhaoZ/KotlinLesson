package haha

fun main(args: Array<String>) {
    val b = 10
    val a = 15
    val result = sub(a,b)
    println(result)
}
//求a和b差 并且需要返回正数
fun sub(m:Int,n:Int):Int{
    //第一种 if判断语句
//    if(m>n){
//        return m-n
//    }else{
//        return n-m
//    }
    //第二种 简化if语句
//    if(m>n)//如果语句里面只有一行代码就可以去掉{}
//        return m-n
//    else
//        return n-m
    //第三种:更加精简if
//    if(m>n) return m-n else return n-m
    //第四种 :if语句返回值是{}最后一行
//    val result = if(m>n){
//        println("说明m>n")
//         m-n
//    }else{
//         n-m
//    }
    val result = if(m>n) m-n else n-m
    return if(m>n) m-n else n-m
}


