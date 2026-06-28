package first_phase

fun main(args: Array<String>) {


    val number = 824

    val result = toBinaryString(number)

    println("$number is $result")

}

fun toBinaryString(number: Int): String {

    val binary = StringBuilder()
    var newNumber = number

    var index = 0

    while (newNumber > 0) {

        if ((newNumber % 2) == 0) {
            binary.insert(index, "0")
        } else {
            binary.insert(index, "1")
        }

        index++

        newNumber /= 2
    }

    return binary.reversed().toString()
}