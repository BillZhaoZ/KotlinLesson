package 第五天面向对象加强

fun main(args: Array<String>) {
    //通过listof创建list集合(只读的集合)
    val list1 = listOf("张三", "李四", "王五")
    val list2 = listOf("张三", "李四", "王五")
    //可以访问元素
    println(list1[0])
    list1.get(0)
    //不能够添加数据
//    list1.add()
    //不能修改里面的元素
//        list1[0] = "赵六"

    //可读可写可扩展list集合
    val list3 = mutableListOf("张三", "李四", "王五", 10)
    //可以添加
    list3.add("赵六")
    //往指定的位置添加元素
//    list3.add(0,"周七")
    //修改元素
    list3[0] = "新张三"
    //打印集合
    println(list3)

    //ArrayList
    val list4 = arrayListOf("张三", "李四", "王五")
    //添加数据
    list4.add("赵六")
    list4.remove("张三")
    println(list4)

    //通过构造方法创建集合
    val mulist = MutableList(10) {
        "张三"
    }
    println(mulist)

    //不能像kotlin一样直接初始化
    val list = ArrayList<String>()
    list.add("张三")
    list.add("张三")
    list.add("张三")

}