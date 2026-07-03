package first_phase.anagrams


fun main(args: Array<String>) {


    val words = listOf("abc", "def", "ghi", "jkl", "mno", "wxyz", "bca", "nom", "hig", "fed", "jlk")
    groupAnagrams(words)
}

fun groupAnagrams(words: List<String>) {

    val map: HashMap<String, List<String>> = HashMap()

    for (word in words) {

        val sortedWord = word.toCharArray().sortedArray().joinToString("")
//        println(sortedWord)
        if (map.containsKey(sortedWord)) {
            val currentList: MutableList<String> = map[sortedWord]?.toMutableList() ?: mutableListOf()
            currentList.add(word)
            map[sortedWord] = currentList
        } else {
            map[sortedWord] = listOf(word)
        }
    }

    printMap(map)
}

fun printMap(map: HashMap<String, List<String>>) {

    for ((key, value) in map) {
        println("$key -> $value")
    }

    println("\n®")

    for (key in map.keys) {

        println("$key  :  ${map[key]}")
    }
}