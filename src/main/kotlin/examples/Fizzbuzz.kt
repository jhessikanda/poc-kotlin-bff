package examples

/**
 * Write a short program that prints each number from 1 to 100 on a new line.
 * For each multiple of 3, print "Fizz" instead of the number.
 * For each multiple of 5, print "Buzz" instead of the number.
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 **/

fun fizzBuzz(number: Int): String = when {
    number % 3 == 0  -> "Fizz"
    number % 5 == 0 -> "Buzz"
    number % (3*5) == 0 -> "FizzBuzz"
    else -> "$number"
}

fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}