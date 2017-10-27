package 第一天基础

/**
 * 字符串删除空格
 * trim 删除首尾空格
 */
fun main(args: Array<String>) {

    /*---------------------------- 删除空格trim ----------------------------*/
    val str1 = "    asfdsf  "
    println(str1.trim())


    /*---------------------------- 删除前导空格trimMargin ----------------------------*/
    val str2 = """   /中国
        /广东省
        /深圳市"""
    println(str2.trimMargin("/"))

}