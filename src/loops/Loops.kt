package loops

fun main(args: Array<String>) {
    // for loop
    var sum = 0
    for(i in 1..100) {
        sum+=i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Phyton")
    for(element in list) {
        println(element)
    }
    for ((index, value) in list.withIndex()) {
        println("Index is $index and value is $value")
    }

    for (char in "I love Kotlin") {
        println(char)
    }

    // while loop
    var x = 9
    while (x >0) {
        println(x)
        x--
    }
    println("++")
    while (x <10) {
        println(x)
        x++
    }

    // Break and Continue statements
    for (c in "Phyton") {
        if (c == 'o') {
            break
        }
        println(c)
    }

    val list2 = listOf("Book", "Table", "Laptop")

    for(str in list2) {
        if (!str.contains('o')) {
            continue
        }
        // calculations...
        println(str)
    }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}