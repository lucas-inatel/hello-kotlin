fun main(args: Array<String>) {
    val carro1: Carro = UnoMile()
    val carro2: Carro = Corolla()

    carro1.ano = 1900
    carro1.descricao = "Pelomeno"
    carro1.valor = 200.0
    println("Carro - Descricao: ${carro1.descricao} | Ano: ${carro1.ano} | Valor: R$ ${carro1.valor}")
    // Carro - Descricao: Pelomeno | Ano: 1900 | Valor: R$ 200.0

    carro2.ano = 2018
    carro2.descricao = "Carrão da porra"
    carro2.valor = 80000.0
    println("Carro - Descricao: ${carro1.descricao} | Ano: ${carro1.ano} | Valor: R$ ${carro1.valor}")
    // Carro - Descricao: Carrão da porra | Ano: 2018 | Valor: R$ 80000.0

    println(carro1.calcularIdade(2018)) // 70
    println(carro2.calcularIdade(2018)) // 118
}

interface Carro {
    var ano: Int
    var descricao: String
    var valor: Double

    fun calcularIdade(anoAtual: Int): Int
}

data class UnoMile(
        override var ano: Int = 0,
        override var descricao: String = "",
        override var valor: Double = 0.0) : Carro {
    override fun calcularIdade(anoAtual: Int): Int {
        return anoAtual - ano
    }
}

data class Corolla(
        override var ano: Int = 0,
        override var descricao: String = "",
        override var valor: Double = 0.0) : Carro {
    override fun calcularIdade(anoAtual: Int): Int {
        return anoAtual - ano
    }
}