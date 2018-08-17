fun main(args: Array<String>) {
    val homem: Humano = Homem()
    val mulher: Humano = Mulher()

    homem.idade = 50
    homem.nome = "Luiz Gonzaga"
    println("Homem - Nome: ${homem.nome} | Idade: ${homem.idade}")
    // Homem - Nome: Luiz Gonzaga | Idade: 50

    mulher.idade = 30
    mulher.nome = "Rita de Cássia"
    println("Mulher - Nome: ${mulher.nome} | Idade: ${mulher.idade}")
    // Mulher - Nome: Rita de Cássia | Idade: 30

    println(mulher.calcularIdade(40)) // 70
    println(homem.calcularIdade(40)) // 90
}

open class Humano(var nome: String = "", var idade: Int = 0) {
    fun calcularIdade(anos: Int) = idade + anos
}

class Homem : Humano()
class Mulher : Humano()