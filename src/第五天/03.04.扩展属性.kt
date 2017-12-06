package 第五天面向对象加强

/**
 * 1.对于扩展属性 不能直接赋值  需要通过get方法赋值
 * 2.扩展属性并不是一个字段  只是生成了getPhone这个方法
 * 3.var 说明只是生成了get和set方法 并没有创建这个字段
 * 4.如果属性值不可变一般使用扩展属性比较方便
 * 5.如果属性值可变   不建议使用扩展属性
 *
 */
fun main(args: Array<String>) {
    val student = Student("张三",20)
    student.phone = "132444"
    println(student.name)
}

class Student(var name:String,var age:Int)
//定义了扩展属性
var Student.phone
get() = "124344"
set(value) {
    //没有field
//    field = value
    name = value
}
