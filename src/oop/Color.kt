package oop

enum class Color(val rgb: Int) {
    RED(0xFF0000), BLUE(0x0000FF), GREEN(0x00FF00), YELLOW(0xFFFF00)

    fun containsRed(): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
    // 0..9 -> 2137 (decimal)
    // 0..9, A, B, C, D, E, F -> 0x10
    println(0x10) // 16
    println(0x1F) // 31
    println(0xFF) // 255
    println(0xCAFEBABE)
// https://www.w3schools.com/colors/colors_picker.asp
    println(0x000000) // black
    println(0xFFFFFF) // white
    println(0xFF0000) // red
    println(0x00FF00) // green
    println(0x0000FF) // blue
    println(0x000088) // dark blue

    // binary numbers
    // 0..1 -> 0b1010
}