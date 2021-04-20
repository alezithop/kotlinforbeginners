package oop

class Book(val title:String, val author: String, var publicationYear:Int, var price:Double) {

    override fun toString():String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }

}

data class DataBook(val title:String, val author:String, val publicationYear: Int, var price: Double) {

    fun print() {
        println()
    }
}

fun main(args: Array<String>) {
    val book = Book("Super book", "John doe", 2017, 99.99)
    val book2 = Book("Super book", "John doe", 2017, 99.99)

    val dataBook = DataBook("Super book", "John doe", 2017, 99.99)
    val dataBook2 = DataBook("Super book", "John doe", 2017, 99.99)
    // with this way we can create new objects from existing one using a really concise syntax, while also being able to change selected properties of it.
    val dataBook3 = dataBook.copy(price = 89.99)

    println(book)
    println(dataBook)
    println(dataBook3)

    // we can decompose each of the objects we have into their properties
    // that's going to create four variables of title, author, year and price
    // And it's going to set this to the values of each property of our data class
    val (title, author, year, price) = dataBook

    println(title)
    // printed: Super book
    println(author)
    // printed: John doe

    println(book.equals(book2))
    // printed: false

    // recommended compare objects only when they are DataClass type since its comparing its content
    println(dataBook.equals(dataBook2))
    // printed: true

    // hashSet cannot have duplicates, this only works correctly for DataClass objects
    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    println(set)
    // printed: [DataBook(title=Super book, author=John doe, publicationYear=2017, price=99.99), DataBook(title=Super book, author=John doe, publicationYear=2017, price=89.99)]

    // with objects of normal class we cannot correctly use hash sets on any other data structures that use hashing, in this case will includes duplicates
    val set2 = hashSetOf(book, book2)
    println(set2)
    // printed: [Book[title=Super book, author=John doe, publicationYear=2017, price=99.99], Book[title=Super book, author=John doe, publicationYear=2017, price=99.99]]
}