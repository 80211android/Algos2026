package first_phase.palindromez

fun main(args: Array<String>) {

//    val word = "Helloi Jorge!!"

//    val word = "Jorge!!"

//    val word = "azbcba"
    val word = "abxycyxaba"

    val result = isPalindrome2(word, true)
    println("Is  $word a palindrome!  $result")

}

fun isPalindrome2(word: String, flag: Boolean): Boolean {

    println(" With for loop ")

    var end = word.length -1

    for (i in 0 .. end) {

        if (word[i] != word[end]  &&  i < end) {
            return false
        }
        end--
    }


    return true
}