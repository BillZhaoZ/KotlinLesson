package 第六天

fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张四","李国华","王二麻子")
    //把姓张的分成一组  张  张三,张四
    val map = list.groupBy {
        when{
            it.startsWith("张")->"张"
            it.startsWith("李")->"李"
            else->"其他"
        }
    }

    println(map)
}