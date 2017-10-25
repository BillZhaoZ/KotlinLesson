package haha

/**
 * while  满足条件就循环 只会当条件满足时才会执行
 * do while  满足条件就循环   不满足条件也会执行一次
 */
fun main(args: Array<String>) {
    var a = -1
    //将小于100的整数全部打印
//    while (a>0){ //只要满足条件都可以循环
//        println(a)
//        a = a-1
//    }

    //do while
    do {
        println(a)
        a = a-1
    }while (a>0)//满足条件执行
}