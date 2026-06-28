package first_phase

fun main(args: Array<String>) {

    val value = 273
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val numberList = listOf<Int>(20,22,31,51,57,67,75,75,76,81,90,113,115,119,129,131,145,146,163,187,200,205,208,222,225,227,240,240,247,252,257,260,263,266,267,273,292,311,352,362,370,416,419,424,437,441,458,463,465,467,470,486,488,506,518,530,531,557,566,590,601,614,617,631,639,641,644,648,651,664,691,692,695,698,711,715,732,734,759,778,793,797,802,807,811,816,838,842,858,865,881,889,894,925,947,949,970,982,984,1000)

//    95,698,711,715,732,734,759,778,793,797,802,807,811,816,838,842,858,865,881,889,894,925,947,949,970,9

    val start = 0
    val end = numberList.size -1

    val counter = 0

    searchNumer(numberList, value, start, end, counter)

}


fun searchNumer(numList: List<Int>, value: Int, start: Int, end: Int, counter: Int) {


    var newCounter = counter + 1
    val middle = ((end - start) / 2) + start

    println(" Counter: $newCounter .    ${numList[middle]}")


    if (value < numList[middle]) {
        searchNumer(numList, value, start, middle, newCounter)

    } else if (value > numList[middle]) {
        searchNumer(numList, value, middle, end, newCounter)

    } else if (value == numList[middle]) {
        println("value   $value found at index $middle .     Value of numList[middle]  ${numList[middle]}")
    } else {
        println("value   $value NOOT found at   $middle .  ${numList[middle]} .        ")
    }

}