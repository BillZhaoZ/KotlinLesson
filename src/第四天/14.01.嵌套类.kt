
/**
 * 查看字节码发现没有inner关键字的class其实是static静态类  不依赖与外部类的环境
 */
fun main(args: Array<String>) {

}
class OutClass{
      class InClass{
        fun sayHello(){

        }
    }
}