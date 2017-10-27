
fun main(args: Array<String>) {
    val animal1: IAnimal = IDog()
    val animal2: IAnimal = ICat()

}
//动物叫
fun call(animal:IAnimal){

}

open class IAnimal {

}

class IDog : IAnimal() {
    fun wangwang() {
        println("狗汪汪叫")
    }
}

class ICat : IAnimal() {
    fun miaomiao() {
        println("猫喵喵叫")
    }
}