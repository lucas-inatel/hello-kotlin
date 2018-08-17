fun main(args: Array<String>){
    // Triples
    val coordinates3d: Triple<Int, Int, Int> = Triple(3,5, 4)
    val coordinates3d2 = Triple(3,5, 4)
    val coordinates3d3 = 3 to 4 to 5

    val (x,y,z) = coordinates3d2
    val (w,k,_) = coordinates3d2 // Ignorando um dos valores

    println(coordinates3d.first)
    println(coordinates3d.second)
    println(coordinates3d.third)

    println(x)
    println(y)
    println(z)
}