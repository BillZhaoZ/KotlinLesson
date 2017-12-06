package 第六天高阶函数和lambda表达式

/**
 * lambda表达式里面只有一个参数  就可以省略用it表示
 */
fun main(args: Array<String>) {
    var a = 10
    add(a){
        println(it)
    }
}
fun add(a:Int,action:(Int)->Unit){
    action(a+10)
}