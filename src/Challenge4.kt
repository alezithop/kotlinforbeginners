/*
Create a class representing a book. Every book has a title, an author, a publication year and is either borrowed or not. Choose an appropriate data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the borrowed property is updated accordingly. Also, a book should be able to print itself to the command line, including its title, author, and publication year.
 */

class Book (val title: String, val author: String, val year: Int, var borrowed: Boolean ) {
    init {
        println("Class initialized")
    }

    fun borrowBook() {
        if (!this.borrowed) {
            this.borrowed = true
            println("Book borrowed successfully")
        } else {
            println("Book already borrowed")
        }
    }

    fun returnBook() {
        if (this.borrowed){
            this.borrowed = false
            println("Book returned successfully")
        } else {
            println("Book already in library, you can borrow it")
        }
    }

    fun bookInfo() {
        println("Book  details")
        println("Title: ${this.title}")
        println("Author: ${this.author}")
        println("Year: ${this.year}")
        if (!this.borrowed) println("Available to borrow") else println("Unavailable to borrow")
    }
}

fun main(args: Array<String>) {
    val book = Book("Y colorin colorado este cuento aun no se ha acabado", "Odin Dupeyron", 2000, false)
    book.bookInfo()
    book.borrowBook()
    book.borrowBook()
    book.bookInfo()
    book.returnBook()
    book.returnBook()
    book.bookInfo()
}