package model

import Config
import business.Blockable
import business.Moveable
import enum.Direction
import org.itheima.kotlin.game.core.Painter

/**
 * 坦克
 */
class Tank(override var x: Int, override var y: Int) : Moveable {
    //碰撞的方向
    var badDirection: Direction? = null
    //碰撞的阻挡物
    var badBlock: Blockable? = null

    override fun willCollision(block: Blockable): Direction? {
        var willCollision = false

        //通过准备移动过去x和y碰断
        var x = this.x
        var y = this.y
        when (direction) {
            Direction.UP -> y -= speed
            Direction.DOWN -> y += speed
            Direction.LEFT -> x -= speed
            Direction.RIGHT -> x += speed
        }

        if (y >= block.y + block.height) {
            willCollision = false
        } else if (y <= block.y - height) {
            willCollision = false
        } else if (x >= block.x + block.width) {
            willCollision = false
        } else if (x <= block.x - width) {
            willCollision = false
        } else {
            willCollision = true
        }
        return if (willCollision) direction else null
    }

    override fun notifyCollision(badDirection: Direction?, badBlock: Blockable?) {
        this.badDirection = badDirection
        this.badBlock = badBlock
    }

    override var width: Int = Config.block
    override var height: Int = Config.block

    override var direction: Direction = Direction.DOWN
    override var speed: Int = 8

    /**
     * 坦克绘制方式
     * when表达式返回值和函数表达式
     */
    override fun draw() = Painter.drawImage(when (direction) {
        Direction.UP -> "img/tank_u.gif"
        Direction.DOWN -> "img/tank_d.gif"
        Direction.LEFT -> "img/tank_l.gif"
        Direction.RIGHT -> "img/tank_r.gif"
    }, x, y)

    /**
     * 移动方法
     * 重新求坦克的x和y
     */
    fun move(dir: Direction) {
        //判断是否是当前方向
        if (dir != this.direction) {
            //改变坦克的方向
            this.direction = dir
            return //不需要移动
        }

        //判断是否会阻挡
        if (badDirection == this.direction) {
            //要移动的方向是阻挡的方向
            return
        }

        //移动
        when (dir) {
            Direction.UP -> y -= speed
            Direction.DOWN -> y += speed
            Direction.LEFT -> x -= speed
            Direction.RIGHT -> x += speed
        }
        //坦克越界处理
        if (y < 0) {
            y = 0
        } else if (y > Config.gameHeight - height) {
            y = Config.gameHeight - height
        }
        if (x < 0) {
            x = 0
        } else if (x > Config.gameWidth - width) {
            x = Config.gameWidth - width
        }
    }

    /**
     * 发射一枚子弹
     */
    fun shot(): Bullet {
        //子弹的宽度和高度需要通过子弹来获取
        //子弹x和y需要坦克传递给它


        return Bullet(direction){bulletWidth,bulletHeight->
            var bulletX = 0
            var bulletY = 0
            when (direction) {
                Direction.UP -> {
                    //        子弹x = 坦克x+(坦克宽度-子弹宽度)/2
                    bulletX = x + (width - bulletWidth) / 2
//        子弹y = 坦克y-子弹高度/2
                    bulletY = y - bulletHeight / 2
                }
                Direction.DOWN->{
                    bulletX = x+(width-bulletWidth)/2
                    bulletY = y+height-bulletHeight/2
                }
                Direction.LEFT->{
                    bulletX = x-bulletWidth/2
                    bulletY = y+height/2-bulletHeight/2
                }
                Direction.RIGHT->{
                    bulletX = x+width-bulletWidth/2
                    bulletY = y+height/2-bulletHeight/2
                }
            }
            //返回二元元组
            bulletX to bulletY
        }
    }
}