package 第六天

fun main(args: Array<String>) {
    val list:MutableList<String> = mutableListOf("张三","李四","王五")
    //高阶函数  lambda表达式  扩展函数
/*---------------------------- apply ----------------------------*/
    //1.T.apply每一个对象都有apply函数
    //2. apply里面传递的是一个函数T.() -> Unit  这个函数是T这个对象扩展函数
    //3.this  //代表list集合
    //4.调用集合里面方法可以直接调用
    //5.apply函数返回的即使当前集合
    list?.apply {
        this  //代表list集合
        add("赵六")
        add("赵六")
        add("赵六")
        add("赵六")
    }?.add("周七")

/*---------------------------- let ----------------------------*/
    //1.T.let  let函数是扩展函数
    //2.(T) -> R let传递的是函数  函数参数是当前对象
    //3.let返回的就是lambda表达式返回值
    val result = list?.let {
        it.add("张三")
        it.add("李四")
        it.add("王五")
        "哈哈"
    }
    println(result)
/*---------------------------- with ----------------------------*/
    //1.with不是扩展函数  是一个单独的函数
    //2.with第二个参数是传递的对象扩展函数 T.() -> R
    //3.this代表当前传递的对象
    //4.可以直接调用对象里面的方法
    //5.with返回值是lambda表达式返回值
    val withResult = with(list){
        add("张三")
        add("李四")
        "哈哈"
    }
    println(withResult)
/*---------------------------- run ----------------------------*/
    //1.T.run 扩展函数
    //2.T.() -> R参数是扩展函数
    //3.this代表当前对象
    //4.可以直接调用对象里面方法
    val runResult = list.run {
        add("张三")
        add("张三")
        add("张三")
        "呵呵"
    }
    println(runResult)
}

class Data{
    fun add(){

    }
    fun sub(){
        add()
    }
}

