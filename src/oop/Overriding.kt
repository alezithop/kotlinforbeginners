package oop

abstract class Course (val topic: String, val price: Double) {
    open fun learn () {
        println("Learning a $topic course.")
    }

    open fun discount() {
        println("Learning a $topic course with a special discount.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotlin", 999.99), Learnable {
    override fun learn () {
        super<Course>.learn()
        super<Learnable>.learn()
        println("Learning special kotlin course.")
    }

    override final fun discount() {
        println("Learning a $topic course with a fantastic special discount.")
    }
}

fun main (args: Array<String>) {
    var course = KotlinCourse()
    course.learn()
}