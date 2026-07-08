package first_phase.sliding_windows

fun main(args: Array<String>) {
    val theArray = listOf(1, 4, 2, 10, 23, 3, 1, 0, 20)
//    val theArray = listOf(5, 2, -1, 0, 3)
//    val theArray = listOf(5, 7, 1, 4, 3, 6, 2, 9, 2)


    val windowSize = 4
//    val windowSize = 3
//    val windowSize = 5

    val result = slidingWindowOne(theArray, windowSize)
    println(" #Implementation  The largest sum is $result ")

}

fun slidingWindowOne(list: List<Int>, windowSize: Int): Int {

    var maxSum = 0

    for (num in 0 until windowSize) {
        maxSum += list[num]
    }

    var currentSum = maxSum

    for (i in windowSize until list.size) {

        val substractingSpot = i - windowSize
        currentSum = currentSum + list[i] - list[substractingSpot]

        if( currentSum > maxSum ) {
            maxSum = currentSum
        }

    }

    return maxSum
}