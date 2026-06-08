

fun main () {

    val word = "twos"
    println("Initial workd:  $word")

    sortWord(word)
}

fun  sortWord(input: String) {

    val holder = mutableListOf<Char>()
    val holderArray = arrayListOf<Char>()
    val newString = input.toCharArray()

    for (k in newString.indices) {


        for (i in 0 until newString.size -1) {
            val x1 = newString[i]
            val x2 = newString[i+1]
            val x3 = "ss"

            if (newString[i] > newString[i+1]) {

                println(" ${newString[i]}    ${newString[i+1]}")
                val firstChar = newString[i]
                newString[i] = newString[i+1]
                newString[i+1] = firstChar
            }
        }
    }

    val sortedWord = newString.joinToString("")

    println(" My Output:  $sortedWord")
    println(" Correct sorting:  ${input.toSortedSet().joinToString(separator = "") }")


}
