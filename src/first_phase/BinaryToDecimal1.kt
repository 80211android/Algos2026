package first_phase

fun main(args: Array<String>) {


    val number = 824

    val result = toBinaryString(number)

    println("$number is $result")

}

fun toBinaryString(number: Int): String {

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