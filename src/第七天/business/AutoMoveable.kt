package business

import enum.Direction
import model.View

/**
 * 子弹具有自动移动的能力
 */
interface AutoMoveable:View {
    //自动移动方向
    var direction:Direction
    //自动移动速度
    var speed:Int
    //自动移动方法
    fun autoMove()
}