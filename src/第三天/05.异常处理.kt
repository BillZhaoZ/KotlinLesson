package 第三天函数加强

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    var a = 10
    var b = 0
    try {//有可能出现异常的代码
        println(div(a, b))
    } catch (e: Exception) {
        //捕获异常并处理
        println("程序出现异常了 ${e.message}")
    }finally {
        //不管有没有异常 都会执行下面的代码
        //关闭io  关闭cursor
        println("执行了finally里面的代码")
    }

    //kotlin异常处理和java对比
    //kotlin没有编译时异常
    //java有编译时异常提示
    val file = File("");
    val bfr = BufferedReader(FileReader(file));
}

//求a除b
fun div(a: Int, b: Int): Int {
    if (b == 0) {
//        println("不能除")
//        return 0
        //抛出异常
        throw Exception("分母为0了")
    } else {
        return a / b
    }
}


