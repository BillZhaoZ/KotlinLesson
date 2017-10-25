package haha

/**
 * break 跳出这个循环 后面循环不会再执行了
 *continue  跳出当前这次循环  后面循环还会继续执行
 */
fun main(args: Array<String>) {
    var s = "abcde"
    //遍历每一个字符
    for (c in s){
        //找到c  停止输出后面的字符
        if(c=='c'){//找到c这个字符
//            break  //a,b
//            continue a,b d,e
//            return  方法执行完成  后面方法不会执行
        }
        println(c)
    }
    print("方法执行结束了")
}