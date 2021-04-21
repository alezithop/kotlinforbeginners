package io

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    for(i in 1..100) {
        println()
    }

    // Tree
    // tree
    // ['t', 'r', 'e', 'e']
    // {'t', 'r', 'e'}
    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        // print the word that has been guessed so far
        // _ _ _ _ _
        // _ e _ e _
        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails \n\n")

        print("Guess letter: ")
        val input = readLine()

        if (input == null) {
            continue
        } else if(input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            fails++
        }
    }
    printExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails \n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print(character + " ")
        } else {
            print("_ ")
        }
    }
}