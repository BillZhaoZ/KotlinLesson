package 第二天.作业

fun main(args: Array<String>) {
    haha()
}

//实现输出1--100之间所有不能被7整除的数，并求和要求：每输出4个数据换行显示
fun haha() {
    var range = 1..100
    var sum = 0//和
    var count = 0//找到的不能被7整除数据个数
    range.forEach {
        //7%7  0
        if (it % 7 != 0) {
            //不能被7整除
            print("$it  ")
            //两个是等价的
//            count = count+1
            count++

            //如果是4整数倍 换行
            if (count % 4 == 0) {
                println()
            }

            //下面两个是完全一样
//            sum = sum+it
            sum += it

        }
    }
    println()//换行
    println(sum)
}