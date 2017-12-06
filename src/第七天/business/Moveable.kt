package business

import enum.Direction
import model.View

/**
 * 移动的能力
 */
interface Moveable:View{
    var direction:Direction
    var speed:Int
    /**
     * 判断当前可移动的物品(坦克)是否会和传递过来的阻挡物会碰撞
     * 如果返回为null 说明不会碰撞  不为空 返回的是碰撞的方向
     */
    fun willCollision(block:Blockable):Direction?

    /**
     * 收到通知会碰撞
     */
    fun notifyCollision(badDirection: Direction?, badBlock: Blockable?)
}