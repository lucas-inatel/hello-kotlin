fun main(args: Array<String>){
    val idade = "10"
    val anos = 10
    val soma = idade + anos
    println(soma) // resultado 1010

    val soma2 = idade.toInt() + anos
    println(soma2) // resultado 20


    println(idade.toInt())    // 10
    println(idade.toDouble()) // 10.0
    println(soma2.toString()) // 20
    println(soma2.toFloat())  // 20.0
}