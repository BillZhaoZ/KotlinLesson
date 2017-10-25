package haha

/**
 * 相同数据类型元素的集合
 */
fun main(args: Array<String>) {
    //定义数组
    val arr1 = arrayOf("张三","李四","王五")
    val arr2 = arrayOf("张三","李四","王五",20)
    //Any所有类型的父类型

    //8种基本数据类型数组
//    BooleanArray
//    ByteArray
//    ShortArray
//    CharArray
//    IntArray
//    FloatArray
//    DoubleArray
//    LongArray
    //对于Stirng字符串没有对应StringArray
//    StringArray  不是String数组  java里面的api

    //定义Int类型数组
    val intArray = IntArray(10)//定义Int类型数组  并且数组元素个数为10个  每一个元素是没有赋值的

    //定义Int数组  并且将数组里面每一个元素赋值为0
    val intArray2 = IntArray(10){//定义了长度为10的数组  里面每一个元素都是0
        0
    }
}
