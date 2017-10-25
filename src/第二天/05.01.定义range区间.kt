package haha

/**
 * 区间:[1,100]  1...100
 *       [1,100)1....99
 */
fun main(args: Array<String>) {
    //定义一个从1到100的数据类型
    //闭区间[1,100]
    var range = 1..100  // IntRange
    var range2 = IntRange(1,100)
    //半开半闭区间 [1,100)
    var range3 = 1 until 100

    //LongRange
    val longRange1 = 1L..100L
    val longRange2 = LongRange(1,100)
    val longRange3 = 1L until  100L

    //CharRange
    val charRange1 = 'a'..'z'
    val charRange2 = CharRange('a','z')
    val charRange3 = 'a' until  'z'
}