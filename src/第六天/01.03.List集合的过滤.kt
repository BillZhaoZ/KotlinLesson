package 第五天面向对象加强

fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张三","李五","李六")
    //想把张三过滤出来
    //过滤的条件
//    val zhangsanList =list.filter {
//        it.startsWith("李")
//    }
    //将过滤的结果添加到第一个传递的集合汇总
//    val zhangsanList = list.filterTo(mutableListOf("下面是姓张的")){
//        it.startsWith("张")
//    }
//    println(zhangsanList)

    //多了元素角标
    val list2 = list.filterIndexed{index,s->
        index%2==0
    }
    println(list2)
}
