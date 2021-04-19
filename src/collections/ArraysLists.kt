package collections

fun main(args: Array<String>) {
    // Arrays
    // To create a new array
    val array = arrayOf("Texas", "Iowa", "california")

    val list = listOf("Orange", "Apple", "Bananas")

    // Lists
    val arraylist = arrayListOf("Patrick", "Michael", "Sarah")
    arraylist.add("Sandra")

    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states
    println(allStates.size)

    val empty: Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")) {
        println("Yes it contains Kentucky")
    } else {
        println("No it does not contain Kentucky")
    }
    var list2 = arrayListOf("Peter")
    println(arraylist[0])
    println(arraylist + list2)
    println(arraylist.size)
    println(arraylist.isEmpty())
    println(arraylist.contains("Sarah"))
    arraylist.add("Josh")
    arraylist.add(1, "Jack")
    println(arraylist)

    arraylist.remove("Michael")
    println(arraylist)

    val removed = arraylist.remove("Josephine")
    println(arraylist)
    println(removed)

    val sublist = arraylist.subList(1, 4)
    println(sublist)
}