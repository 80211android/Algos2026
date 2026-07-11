package first_phase.string_contains_substring

fun main(args: Array<String>) {

    val string = "geekszfoekszrgeeksz";
    val pattern = "eksz";

    val result = findSubstring(string, pattern)

    println(" $pattern found  $result times \n")

}

fun findSubstring(string: String, pattern: String): Int {

    val offset =  pattern.length
    var counter = 0

    for (i in 0..string.length - offset) {

        val substring = string.substring(i, i + offset)
        if (substring == pattern) {
            counter++
        }
    }

    return counter
}