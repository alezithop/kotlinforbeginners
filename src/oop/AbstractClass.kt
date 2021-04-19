package oop

abstract class Character (open val name:String, open var power:Int){

    abstract fun attack()

    fun iddlingPose(phrase: String) {
        println("... $phrase.")
    }

    open fun getPotentiatedPower() = 100 - power
}

class WaterNative(override val name:String, override var power: Int): Character (name, power) {

    override fun attack() {
        println("$name started its water attack with a power of ${getPotentiatedPower()} because $name was affected by the weather.")
    }

    fun specialWaterAttack() {
        println("Special Water attack performed.")
    }
}

class FireNative(override val name: String, override var power: Int): Character (name, power) {
    override fun attack() {
        println("$name started its fire attack with a power of ${getPotentiatedPower()} because $name was potentiated by the extra bonus fire.")
    }

    override fun getPotentiatedPower() = power + 50

    fun specialFireAttack() {
        println("$name started its Special Fire attack performed.")
    }
}

fun main(args: Array<String>) {

    val waterNative = WaterNative("Katara", 30)
    waterNative.attack()

    val fireNative = FireNative(power = 40, name = "Zuko")
    fireNative.specialFireAttack()
    fireNative.attack()
}