package examples

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice"), Person("Bob", 45))
    val nameToAge = listOf("Alice" to 42, "John" to 28, "Carol" to 51)

    val oldest = people.maxBy { it.age ?: 0 }
    println("The oldest is ${oldest?.name}")

    val youngest = nameToAge.minBy { it.second }
    println("The youngest is ${youngest?.first}")
}