package 第二天.作业

fun main(args: Array<String>) {
    var name = "黑马"
    var pwd  ="123"
    login(name, pwd)
}
//登录
fun login(name:String,pwd:String){
    //用户名 黑马  密码123
    if(name=="黑马"&&pwd=="123"){//&&与 两个条件都要满足  ||逻辑或
        println("登录成功")
    }else{
        println("登录失败")
    }
}