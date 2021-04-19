package oop

open class Person (open val name: String, open var age: Int) {
    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2016 - age
}

class Student(override val name:String, override var age:Int): Person(name, age) {
    fun isStudying(hour:Int) {
        when(hour) {
            in 7..14 -> println("The student is in class.")
            in 17..19 -> println("The student is doing homework.")
            else -> println("The student is resting.")
        }
    }

    fun isIntelligent() = true
}

class Employee(override val name:String, override var age: Int): Person(name, age) {
    fun receivePayment() {
        println("Received payment.")
    }
}

fun main (args: Array<String>) {
    val person = Person("Rita", 68)

    person.speak()
    person.greet("World")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)

    val student = Student("John", 25)
    student.speak()
    student.isStudying(10)
    student.isStudying(18)
    student.isStudying(20)
    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()
    employee.receivePayment()
}