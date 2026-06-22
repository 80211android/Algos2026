package first_phase

fun main(args: Array<String>) {

//    val word = "Helloi Jorge!!"

//    val word = "Jorge!!"

    val word = "azbcba"


    val result = isPalindrome(word)
    println("Is  $word a palindrome!  $result")

}

fun isPalindrome(word: String): Boolean {

    var start = 0
    var end = word.length -1

    while (start <= end) {

        if (word[start] != word[end]) {
            return false
        }
        start++
        end--
    }

    println("${word[1]} is Palindrome")

    return true
}