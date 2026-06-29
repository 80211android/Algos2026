package first_phase

fun main(args: Array<String>) {


    val initialCounter = 0
    val limit = 10

//    fibonacci(0, 1, initialCounter, limit)
    fibonacci(
        counter = initialCounter,
        limit = limit,
    )
}

fun fibonacci(first: Int = 0, second: Int = 1, counter: Int, limit: Int) {

    if (counter < limit -1) {
        print(" $first,")
    } else {
        print(" $first")
        return
    }

    val sum = first + second

    fibonacci(second, sum, counter + 1, limit)
}