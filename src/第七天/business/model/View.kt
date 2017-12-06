package model

/**
 * 所有能够显示的view
 */
interface View {
    var x:Int
    var y:Int
    var width:Int
    var height:Int
    fun draw()
}