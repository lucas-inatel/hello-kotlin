fun main(args: Array<String>) {
    // IF
    print("Select a option or press 'q' to exit: ")
    val choice = readLine().orEmpty()
    if (choice == "q")
        println("You pressed 'q'")
    else
        println(choice)

    val a = 1
    val b = 1
    // IF COMO EXPRESSÃO
    val max = if (a > b) a else b

    // WHEN
    print("Select a option or press 'q' to exit, 'a' to select all, 'b' to jump the line and 'o' to open a document: ")
    var choice2 = readLine().orEmpty()
    choice2 = when(choice2){
        "q" -> "close"
        "a" -> "close"
        "b" -> "close"
        "o" -> "close"
        else -> "Error"
    }

    println(choice2)
}