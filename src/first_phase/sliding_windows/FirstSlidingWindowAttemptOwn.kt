package first_phase.sliding_windows

import first_phase.anagrams.groupAnagrams

fun main(args: Array<String>) {



//    val theArray = listOf(1, 4, 2, 10, 23, 3, 1, 0, 20)

//    val theArray = listOf(5, 2, -1, 0, 3)

    val theArray = listOf(5, 7, 1, 4, 3, 6, 2, 9, 2)



//    val windowSize = 4

//    val windowSize = 3

    val windowSize = 5

    val result = findLargestSum(theArray, windowSize)
    println(" The largest sum is $result ")

}

fun findLargestSum(list: List<Int>, windowSize: Int): Int{

    var maxSum = 0
    var counter = 0

    for (i in 0 until list.size - windowSize) {

        var currentSum = 0

        for (j in 0 until windowSize){
            println(" Current sum is $currentSum and the largest sum is $maxSum")
            currentSum += list[i + j]
            counter++
        }

        if (currentSum > maxSum) {
            maxSum = currentSum
        }
    }

    println(" Counter is $counter ")
    return maxSum
}