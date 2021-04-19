package oop

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color:String): Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving carr...")
    }

    override fun build() {
        println("Built a shiny carr.")
    }
}

class MotorCycle(val color:String): Driveable {
    override fun drive() {
        println("Driving motorcycle")
    }
}

fun main(args: Array<String>) {
    val car = Car("Red")
    car.drive()
    val motorCycle = MotorCycle("Blue")
    motorCycle.drive()
}