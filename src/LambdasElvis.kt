data class Person(
        val name: String,
        val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(
            Person("Lucas", 29),
            Person("José", 15),
            Person("Maria", 20))

    val oldest = persons.maxBy { it.age ?: 0 } // Retorna a posição

    print("The oldest is ${oldest?.name}") // The oldest is Lucas
}