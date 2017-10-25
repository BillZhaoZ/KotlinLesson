package 第一天.作业

fun main(args: Array<String>) {
    var a = 10
    var b = 8
    //交换a和b   a=8  b=10
    var third = 0

    //通过三方变量保存a
    third = a
    //将b值赋值给a
    a = b
    //将三方变量保存的a的值赋值给b
    b = third

    println("a=$a b=$b")
}