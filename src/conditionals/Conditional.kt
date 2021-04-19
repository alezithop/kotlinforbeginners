package conditionals

fun main(args: Array<String>) {
    var age: Int = 0
    // IF example
    do {
        println("Hi buddy! What I see? Looks like you have " + age + " years old.")
        if (age < 18) {
            println("Sorry. You cannot register.")
        } else if (age < 21) {
            println("Hold on for a few seconds while we are preparing all for your register.")
        } else {
            println("Welcome! We're ready to help you to register.")
        }
        age+=9;
    } while ( age < 30)

    val mode: Int = 2
    // WHEN example
    when(mode) {
        1 -> println("The mode is easy.")
        2 -> {
            println("The mode is medium.")
            println("So the mode is busy.")
        }
        3 -> println("The mode is hard and super productive.")
        else -> println("Invalid selection")
    }

    // WHEN expression
    val result = when(mode) {
        1 -> "The mode is easy."
        2 -> {
            println("The mode is medium.")
            "So the mode is busy."
        }
        3 -> "The mode is hard and super productive."
        else -> "Invalid selection"
    }

    println("The expression is: " + result)

    val x = if(mode < 2) {
        println("Mode is less than 2")
        17
    } else {
        0
    }

    println(x)

    // Advanced when constructs
    val aux = 21
    when(aux) {
        5  -> println("aux is 5")
        3*12 -> println("aux is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        !in 41..90 -> println("x is not between 41 and 90")
    }

    when(aux) {
        is Int -> println("Aux is Int type")
        5  -> println("aux is 5")
        3*12 -> println("aux is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        !in 41..90 -> println("x is not between 41 and 90")
    }
}