fun main(args: Array<String>){
    var choice = " "

    while (choice != "q"){
        print("Select a option or press 'q' to exit: ")
        choice = readLine().orEmpty()
        println(choice)
    }

    println("You select 'q' as your choice")
}