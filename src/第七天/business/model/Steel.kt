package model

import Config
import business.Blockable
import org.itheima.kotlin.game.core.Painter

/**
 * 铁墙
 */
class Steel(override var x: Int, override var y: Int) : Blockable {
    override var width: Int = Config.block
    override var height: Int = Config.block

    override fun draw() {
        Painter.drawImage("img/steel.gif", x, y)
    }
}