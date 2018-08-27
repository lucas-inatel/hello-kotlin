data class Usuario(
        var id: Int = 1,
        var nome: String = "",
        var email: String = ""
)

fun main(args: Array<String>) {
    val usuario: Usuario? = null

    usuario?.id = 1
    usuario?.nome = "Lucas Marciano"
    usuario?.email = "lucasmarciano@inatel.br"

    println("ID: ${usuario?.id}")
    println("NOME: ${usuario?.nome}")
    println("E-MAIL: ${usuario?.email}")
}