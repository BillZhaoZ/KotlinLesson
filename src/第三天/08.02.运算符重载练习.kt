package 第三天函数加强

fun main(args: Array<String>) {
    var a  =10
    a++
    println(a)

    //创建一个老师
    var 助教 = Teacher()
    助教.level = 1
    助教.salary = 1000
    println(助教)

    //助教能力增强  转成讲师
    var 讲师 = 助教++
    println(讲师)

    //讲师能力增强  转成副教授
    var 副教授 = 讲师++
    println(副教授)

    println(助教)
}
class Teacher{
    var level = 0 //老师等级
    var salary = 0//老师工资

//    operator fun plus(a:Int)
    //定义出++运算符重载方法
    operator fun inc():Teacher{
        level++
        salary+=500
        return this
    }

    override fun toString(): String {
        return "Teacher(level=$level, salary=$salary)"
    }
}
