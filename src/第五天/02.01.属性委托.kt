package 第五天面向对象加强

import kotlin.reflect.KProperty

/**
 * 属性委托就是把自己字段的get和set方法交给其它类实现
 */
class BigSon {
    //字段的get和set方法交给其它类实现
    var 压岁钱:Int by Father()//将儿子的压岁钱委托给爸爸进行保管
}

class Father{
    //定义字段保存儿子的压岁钱
    var 儿子的压岁钱 = 0
    operator fun getValue(bigSon: BigSon, property: KProperty<*>): Int {
        println("调用了father的getValue方法")
        return 儿子的压岁钱-50
    }

    operator fun setValue(bigSon: BigSon, property: KProperty<*>, i: Int) {
        println("调用了father的setValue方法")
        this.儿子的压岁钱 = i
    }
}
fun main(args: Array<String>) {
    val bigSon  =BigSon()
//    println(bigSon.压岁钱)
    //老爷给儿子100块压岁钱
    bigSon.压岁钱 = 100
    //儿子像要压岁钱
    println(bigSon.压岁钱)

}
