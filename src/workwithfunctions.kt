fun main(args: Array<String>){
    val a = 10
    val b = 5

    println(somar(a, b))               // 15
    println(somar(a))                  // 110
    println(somarInline(a, b))         // 15
    println(a.somarExtension(b))       // 15
    println(a.somarExtensionInline(b)) // 15
}

fun somar(a: Int, b: Int = 100): Int{
    return a + b
}

fun somarInline(a: Int, b: Int) = a + b

fun Int.somarExtension(valor: Int): Int {
    return this + valor
}

fun Int.somarExtensionInline(valor: Int) = this + valor