package haha

fun main(args: Array<String>) {
    var newArr = arrayOf(1,2,3,4,2,3,5)
    //把第三个元素3改成10
    //第一种修改数组元素
//    newArr[2] = 10
//    newArr[0]获取第一个元素

    //第二种修改元素方式
    newArr.set(3,20) //将数组第四个元素数值修改成20
    //遍历数组
    newArr.forEach {
        println(it)
    }
}