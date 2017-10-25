package haha

/**
 * s1和s2两两组合有几种可能
 */
fun main(args: Array<String>) {
    val s1 = "abc"
    val s2 = "123"
    //组合
    //a1  a2  a3  b1 b2 b3  c1 c2 c3
    //打印出来这些组合
    loop@for (c1 in s1){
        //找到s1里面每一个字符
        for (c2 in s2){
            //如果找到b2之后  后面组合不用再输出了 a1  a2  a3  b1
            if(c1=='b'&&c2=='2'){
                break@loop  //跳出的是第二个循环
            }
            //找到s2里面每一个字符
            println("$c1 $c2")
        }
    }

    println("后面执行")
}