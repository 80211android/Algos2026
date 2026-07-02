package first_phase.bubble_sorting

fun main(args: Array<String>) {

//    val list = listOf<Int>(7, 5, 2, 9, 0)
    val list = listOf(83, 17, 42, 95, 6, 61, 28, 74, 39, 52, 11, 88, 33, 67, 24, 79, 45, 13, 56, 91, 38, 72, 5, 49, 84, 21, 63, 97, 30, 58, 14, 76, 47, 22, 69, 35, 81, 9, 54, 93, 26, 48, 71, 16, 60, 37, 85, 43, 8, 66)

    println(list)

    bubbleSort(list)
}

fun bubbleSort(theNumberList: List<Int>) {

    val numberList = theNumberList.toMutableList()
    var counter = 0

    while (counter < numberList.size - 1) {

        if (numberList[counter] > numberList[counter + 1]) {
            val holder = numberList[counter]
            numberList[counter] = numberList[counter + 1]
            numberList[counter + 1] = holder
            counter = 0

        } else {
            counter++
        }

    }

    val sortedList = theNumberList.toMutableList().sorted()
    for (number in sortedList) {
        print(" $number, ")
    }

    println(" **** . ")

    for (number in numberList) {
        print(" $number, ")
    }

}