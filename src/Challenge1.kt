/*
Generate a random number between 1 and 50 using the following code:
val random = Random().nextInt(50) + 1
IntelliJ helps you import the Random class from Java so that you can use it. Don’t worry about the details of imports for now.
Now, use a when statement to switch between the cases where random is in the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40. In each case, print out a message containing the range and the exact value of random.
Test your code in a main() function and run it several times to get different random numbers.
 */
import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1
    when(random) {
        in 1..10 -> println("The range is between 1 and 10, the generated value got it from Random is: $random")
        in 1..20 -> println("The range is between 11 and 20, the  generated value got it from Random is: $random")
        in 1..30 -> println("The  range is between 21 and 30, the generated value got it from Random is: $random")
        in 1..40 -> println("The  range is between 31 and 40, the generated value got it from Random is: $random")
        else -> println("The range is above of 40, the generated value got it from Random is: $random")
    }
}