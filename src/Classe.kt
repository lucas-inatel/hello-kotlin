class Classe {
    lateinit var nome: String

    var ativa: Boolean
        get() = this.nome.isNotEmpty()
        set(value) {
            ativa = value
        }
}

fun main(args: Array<String>) {
    var classe = Classe()

    classe.nome = "Nome"
    classe.ativa = true
}