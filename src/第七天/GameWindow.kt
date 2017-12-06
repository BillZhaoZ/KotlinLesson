
import business.AutoMoveable
import business.Blockable
import business.Moveable
import enum.Direction
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import model.*
import org.itheima.kotlin.game.core.Window
import java.io.File
import java.util.concurrent.CopyOnWriteArrayList

/**
 * 游戏窗体
 * 指定窗体属性
 */
class GameWindow:Window(title = "坦克大战",icon = "img/logo.jpg",width = Config.gameWidth,height = Config.gameHeight) {
    //CopyOnWriteArrayList线程安全
    //保存所有需要绘制的view
    val list by lazy { CopyOnWriteArrayList<View>() }
    //定义我方坦克
    val myTank by lazy { Tank(10*Config.block,12*Config.block) }

    override fun onCreate() {
        //解析地图 找到所有需要绘制的物体
        val file = File(javaClass.getResource("map/1.map").path)
        //每一行数据集合
        val lines = file.readLines()
        //遍历里面每一个元素
        lines.forEachIndexed { line, s ->
            s.forEachIndexed { column, c ->
                when(c){
                    '砖'->list.add(Wall(column*Config.block,line*Config.block))
                    '铁'->list.add(Steel(column*Config.block,line*Config.block))
                    '水'->list.add(Water(column*Config.block,line*Config.block))
                    '草'->list.add(Grass(column*Config.block,line*Config.block))
                }
            }
        }

        //将坦克添加到集合中
        list.add(myTank)
    }
    override fun onDisplay() {
        //将需要绘制的元素绘制
        list.forEach {
            it.draw()
        }
    }

    override fun onKeyPressed(event: KeyEvent) {
        //处理坦克移动WSAD
        when(event.code){
            KeyCode.W->myTank.move(Direction.UP)
            KeyCode.S->myTank.move(Direction.DOWN)
            KeyCode.A->myTank.move(Direction.LEFT)
            KeyCode.D->myTank.move(Direction.RIGHT)
            KeyCode.ENTER->{
                //发射一枚子弹
                val bullet:Bullet = myTank.shot()
                list.add(bullet)
            }
        }

    }

    override fun onRefresh() {
        //判断坦克是否会和某一个阻挡物碰撞
        val tankList = list.filter { it is Moveable }
        val blockList= list.filter { it is Blockable }
        //看一下每一个坦克是否和每一个阻挡物会碰撞
        for (move in tankList) {
            move as Moveable
            var badDirection:Direction? = null
            var badBlock:Blockable? = null
            //和每一个碰撞物进行碰撞试验
            for (block in blockList) {
                block as Blockable
                //判断是否会碰撞
                val willCollision = move.willCollision(block)
                //需要判断返回值是否为空
//                willCollision?.let {
//                    //有碰撞
//                    //跳出内部循环
//                    break
//                }
                if(willCollision!=null){
                    //会碰撞
                    badDirection = willCollision
                    badBlock = block
                    //跳出内部循环
                    break
                }
            }
            //通知坦克会碰撞
            move.notifyCollision(badDirection,badBlock)
        }


        //子弹自动移动
        list.filter { it is AutoMoveable }.forEach {
            it as AutoMoveable
            it.autoMove()
        }
    }
}