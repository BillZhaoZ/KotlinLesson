package 第五天面向对象加强

/**
 * 数据类就是只保存数据,里面没有任何业务逻辑的类 对应的就是java的bean类
 */
fun main(args: Array<String>) {
    val news = News("十九大","国家万岁")
    println(news)
}
//get  set
//tostring
//copy
//hashcode
//equals
data class News(var title:String,var content:String)
