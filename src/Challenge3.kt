
fun main(args: Array<String>) {
    val booksList = arrayListOf("Scary movie", "Scream", "Resident Evil", "Sailor Moon")
    for(book in booksList) {
        if(book.contains('e')){
            for (char in book) {
                println(char)
            }
        }
        println("-------------------------")
    }
}