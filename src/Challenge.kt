

fun main(args: Array<String>) {

    val word = "Helloi Jorge!!"
    println("$word is $word")

    reverseWord(word)
}

fun reverseWord(input: String) {


//    val chars = mutableListOf<Char>()

    val chars: StringBuilder = StringBuilder()

    val wordLength = input.length

    for (i in wordLength - 1 downTo 0) {
//        chars.add(input[i])
        chars.append(input[i])
    }

//    val reversedWord = chars.joinToString("")
    val reversedWord = chars.toString()


    println(reversedWord)
}