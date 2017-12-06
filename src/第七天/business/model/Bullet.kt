package model

import Config
import business.AutoMoveable
import enum.Direction
import org.itheima.kotlin.game.core.Painter

/**
 * 子弹
 * 子弹x和y通过Pair传递过来
 */
class Bullet(override var direction: Direction, create:(Int, Int)->Pair<Int,Int>) :AutoMoveable {
    override var speed: Int = 8
    //自动移动
    override fun autoMove() {
        when (direction) {
            Direction.UP -> y -= speed
            Direction.DOWN -> y += speed
            Direction.LEFT -> x -= speed
            Direction.RIGHT -> x += speed
        }
    }

    override var width: Int = Config.block
    override var height: Int = Config.block
    override var x: Int = 0
    override var y: Int = 0
    //子弹路径
    val bulletPath  by lazy { when(direction){
        Direction.UP->"img/bullet_u.gif"
        Direction.DOWN->"img/bullet_d.gif"
        Direction.LEFT->"img/bullet_l.gif"
        Direction.RIGHT->"img/bullet_r.gif"
    } }
    init {
        //获取子弹宽度和高度
        val size = Painter.size(bulletPath)
        val pair = create(size[0],size[1])
        x = pair.first
        y = pair.second
    }
    override fun draw() {

        Painter.drawImage(bulletPath,x, y)
    }
}