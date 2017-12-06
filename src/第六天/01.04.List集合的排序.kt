package 第五天面向对象加强

fun main(args: Array<String>) {
    val  list = listOf("tzzz","李四","tony","王五")
    //排序
    val list1 = list.sorted()
    //倒叙排序
    val list2 = list.sortedDescending()
    println(list1)
    println(list2)

    //对象排序
    val humanList = listOf(Human("张三",20),Human("李四",30),Human("王五",10))
    //对人的集合做正序排序  通过name字段进行排序
//    val newHumaList1 = humanList.sortedBy {
//        it.age
//    }
//    //根据年纪字段进行倒叙排序
//    val newHumanList2 = humanList.sortedByDescending {
//        it.age
//    }
//    println(newHumanList2)


    //自定义比较器比较   匿名类
    val newList = humanList.sortedWith(object :Comparator<Human>{//object在这里是匿名类的意思
        override fun compare(o1: Human, o2: Human): Int {
            val o1Age = o1.age
            val o2Age = o2.age
            return o2Age-o1Age
        }
    })
    println(newList)
}

class Human(var name:String,var age:Int){
    override fun toString(): String {
        return "Human(name='$name', age=$age)"
    }
}

