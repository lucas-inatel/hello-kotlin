fun main(args: Array<String>){
    // Pairs
    val coordinates: Pair<Int, Int> = Pair(3,5)
    val coordinates2 = Pair(3,5)
    val coordinates3 = 3 to 5 // parece um range mas não é

    val (x,y) = coordinates

    print(coordinates.first)
    println(coordinates.second)

    print(coordinates2.first)
    println(coordinates2.second)

    print(coordinates3.first)
    println(coordinates3.second)

    print(x)
    println(y)
}