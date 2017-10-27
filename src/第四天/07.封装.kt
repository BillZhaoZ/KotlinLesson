/**
 * 封装就是隐藏内部细节实现,暴露功能接口
 * 点餐
 * private  不想让外面访问的函数加上private
 */
fun main(args: Array<String>) {
    val restaurant = Restaurant()
    restaurant.order()

//    restaurant.notifyCook()
}

class Restaurant {
    //点餐
    fun order() {
        getTicket()
        notifyCook()
        cook()
        done()
    }

    private fun getTicket() {
        println("取到点餐票了")
    }

    private fun notifyCook() {
        println("通知师傅做菜了")
    }

    private fun cook() {
        println("开始做菜了")
    }

    private fun done() {
        println("菜做好了")
    }
}