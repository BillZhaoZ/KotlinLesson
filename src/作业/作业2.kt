package 作业

/**
 * 作业2
 */
fun main(args: Array<String>) {

    /*// 1.编码实现登录功能，通过if语句判断，用户名是黑马，密码是123，表示登录成功
    var name: String = "黑马"
    var password: Int = 123

    if (name == ("黑马") && password == (123)) {
        println("登陆成功")
    }*/

    // 2.编写程序，实现输出1--100之间所有不能被7整除的数，并求和 要求：每输出4个数据换行显示

    /* var intArrayOf = 1..100

     var a = 0

     for (i in intArrayOf) {

         if (i % 7 != 0) {
             println("输出：$i")
             a++

             // 4个数据换行一次
             if (a == 4) {
                 a = 0
                 println()
             }
         }
     }
 */
    // 3.根据用户输入数字周一到周日显示对应的英文星期名称缩写，如果用户输入的数字不是1-7的数字提示用户输入错误

    /* var s: String? = readLine()  //可空类型nul

     when {
         s.equals("1") -> println("Monday")
         s.equals("2") -> println("Tuesday")
         s.equals("3") -> println("Wednesday")
         s.equals("4") -> println("Thursday")
         s.equals("5") -> println("Friday")
         s.equals("6") -> println("Saturday")
         s.equals("7") -> println("Sunday")

         else -> println("您输入错误")
     }*/

    // 4.通过代码实现一周学习计划：通过用户输入今天周几，然后知道今天学习什么内容，1、3、5学习编程，2、4、6学习英语，周日休息，如果用户输入的数字不在1-7之间，提示用户输入错误。

    var s = readLine()  //可空类型nul

    if (s.equals("1") || s.equals("3") || s.equals("5")) {
        println("今天学习编程")
    } else if (s.equals("2") || s.equals("4") || s.equals("6")) {
        println("今天学习英语")
    } else if (s.equals("7")) {
        println("今天休息")
    } else {
        println("您输入错误")
    }
}