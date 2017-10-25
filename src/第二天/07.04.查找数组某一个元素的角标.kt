package haha

fun main(args: Array<String>) {
    val array = arrayOf("张三","李四","王五","张三","李四","赵六")
    //查找第一个张三在哪个位置
    val index = array.indexOf("张三")//找到第一个张三
    println("index=$index")
    //找到最后一个张三 3
    val index2 = array.lastIndexOf("张三")//找到最后一个张三
    println("最后一个张三角标=$index2")

    //第二种方式
    //查找第一个张三在哪个位置
    val index3 = array.indexOfFirst { //找到第一个
        it=="张三"//如果是第一个张三  就返回它的角标
    }
    //找到最后一个张三 3
    val index4 = array.indexOfLast {
        it=="张三"//如果是最后一个张三  就返回它的角标
    }
    println("index4=$index4")
}