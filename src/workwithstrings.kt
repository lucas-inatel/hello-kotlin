fun main(args: Array<String>){
    // Concatenação
    val name = "Lucas"
    val secondName = "Marciano"
    val completName = "$name $secondName"
    print(completName)

    // Concatenação com operação
    val n1 = 10
    val n2 = 20
    val result = "n1 * n2 = ${n1*n2}"
    print(result)

    // Multiline
    val bigString = """
       This line 1
       This line 2
       This line 3
    """
    print(bigString)
}