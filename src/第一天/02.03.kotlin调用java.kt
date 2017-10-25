package 第一天基础

import java.math.BigDecimal

fun main(args: Array<String>) {
    var f = 1.123456789123456789f
    println(f)
//    BigDecimal bigde = new BigDecimal();
    var big:BigDecimal = BigDecimal("1.123456789123456789");
    println(big)


    var s = null//Noting?
//    s = ""
    var ss:String? = null//可空的字符串类型  String?
    ss = "fdsfd"
}