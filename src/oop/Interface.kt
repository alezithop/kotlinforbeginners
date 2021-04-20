package oop

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color:Color): Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving carr...")
    }

    override fun build() {
        println("Built a shiny carr.")
    }
}

class MotorCycle(val color:Color): Driveable {
    override fun drive() {
        println("Driving motorcycle")
    }
}

fun main(args: Array<String>) {
    val car = Car(Color.BLUE)
    println(car.color)
    car.drive()
    val motorCycle = MotorCycle(Color.RED)
    motorCycle.drive()
}