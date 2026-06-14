

fun main () {

//    val word = "twos"
//    val word = "alphabetz"
    val word = "ParallelX"


    println("Initial workd:  $word")

    sortWord(word)
}

fun  sortWord(input: String) {

    val newString = input.toCharArray()

    var indexFlag = 0

    while (indexFlag < newString.size -1 ) {
        val x1 = newString[indexFlag]
        val x2 = newString[indexFlag+1]

        if (newString[indexFlag] > newString[indexFlag+1] ) {

            println(" ${newString[indexFlag]}    ${newString[indexFlag+1]}")
            val firstChar = newString[indexFlag]
            newString[indexFlag] = newString[indexFlag+1]
            newString[indexFlag+1] = firstChar
            indexFlag = 0
        } else {
            indexFlag++
        }
    }

    val sortedWord = newString.joinToString("")

    println(" My own sort Output:  $sortedWord")
    println(" Very Correct sorting:  ${input.toCharArray().sorted().joinToString("")}")

}
