
fun main(args: Array<String>) {
    val outClass = OutClass()

}

class OutClass2 {
    var name = "张三"
    inner class InClass {
        var name = "李四"
        fun sayHello() {

        }
    }
}