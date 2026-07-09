package first_phase.anagrams.ocurrance_of_anagram


fun main(args: Array<String>) {

    val theString = "gotxxotgxdogt"
    val word = "got"

    val result = findOcurrancesOfAnagram(theString, word)

    println("  $word  found   $result")

}

fun findOcurrancesOfAnagram(theString: String, word: String): Int {

    var counter = 0
    val sortedWord = word.toCharArray().sorted().joinToString("")

    println(sortedWord)
    for (index in 0 until theString.length - 2) {


        val subString = theString.substring(index, index + 3)
        val sortedSubString = subString.toCharArray().sorted().joinToString("")

        if (sortedSubString == sortedWord) {
            println(" They match:   $subString . $sortedWord .  at subIndex: $index ")
            counter++
        }
    }
    return counter
}