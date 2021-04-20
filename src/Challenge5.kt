import com.sun.org.apache.xpath.internal.operations.Bool

/*
Let’s say we’re running a library where you can lend books and also some movies. We want to write an application to keep track of our inventory.
Create an interface Lendable that defines a borrow() method. Then create an abstract class InventoryItem and two classes Book and DVD which inherit from InventoryItem.
InventoryItem should implement the Lendable interface.
Books and DVDs both have a title, genre and publication year. Books also have an author whereas DVDs have a length in seconds. Add each property to the most suitable class.
You can check your solution by going to my GitHub page linked in this lecture’s resources.
 */

interface Lendable {

    fun borrow()
    fun returnArticle()
    fun queryDetails()
}
abstract class InventoryItem(open val title:String, open val genre:String, open val year:Int, open var borrowed:Boolean): Lendable  {

    override fun borrow() {
        if (borrowed) {
            println("You can't borrow this item since is already borrowed")
        } else {
            borrowed = true
            println("You borrowed $title successfully")
        }
    }

    override fun returnArticle() {
        if (borrowed) {
            borrowed = false
            println("You returned $title successfully")
        } else {
            println("The $title is not borrowed, you can't return it.")
        }
    }
}

class Book(override val title: String, override val genre: String, override val year: Int, override var borrowed: Boolean, val author:String)
    :InventoryItem(title, genre, year, false){

    override fun queryDetails() {
        println("The book $title, genre: $genre, from the year: $year, the author: $author, and it's actually ${if (borrowed) "borrowed" else "available to borrow"}.")
    }
}

class Movie(override val title: String, override val genre: String, override val year: Int, override var borrowed: Boolean, val length: Int)
    :InventoryItem(title, genre, year, false) {

    override fun queryDetails() {
        println("The movie $title, genre: $genre, from the year: $year, the length: $length, and it's actually ${if (borrowed) "borrowed" else "available to borrow"}.")
    }
}

fun main(args: Array<String>) {
    var book = Book("Ana Frank", "drama", 2016, false,"Ana")
    book.queryDetails()
    book.borrow()
    book.queryDetails()
    book.returnArticle()
    book.queryDetails()

    var movie = Movie("Scream","horror",2000,false,120)
    movie.queryDetails()
    movie.borrow()
    movie.queryDetails()
    movie.returnArticle()
    movie.queryDetails()
}