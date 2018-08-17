fun main(args: Array<String>){
    val closedRange = 0..5 // De 0 a 5
    val openRange = 0 until 5 // De 0 a 4
    val decreaseRange = 5 downTo 0 // De 5 a 0
    val decreaseRangeReversed = 0 until 5 // De 5 a 0

    for (index in closedRange){
        print(index)
    }

    println()

    for (index in openRange){
        print(index)
    }

    println()

    for (index in decreaseRange){
        print(index)
    }

    println()

    for (index in decreaseRangeReversed.reversed()){
        print(index)
    }
}