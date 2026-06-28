package first_phase

fun main(args: Array<String>) {


    val number = 824

//    val result = toBinaryWithStringBuilder(number)

    val result = toBinaryWithMutableList(number)


    println("$number is $result")

}

fun toBinaryWithMutableList(number: Int): String {

    val binaryString = mutableListOf<String>()
    var newNumber = number

    while (newNumber > 0) {

        if ((newNumber % 2) == 0) {
            binaryString.add("0")
        } else {
            binaryString.add("1")
        }
        newNumber /= 2
    }

    return binaryString.joinToString("").reversed()
}

fun toBinaryWithStringBuilder(number: Int): String {

    val binaryString = StringBuilder()
    var newNumber = number

    var index = 0

    while (newNumber > 0) {

        if ((newNumber % 2) == 0) {
            binaryString.insert(index, "0")
        } else {
            binaryString.insert(index, "1")
        }

        index++

        newNumber /= 2
    }

    return binaryString.reversed().toString()
}