
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")


    val mlist: MutableList<String> = mutableListOf("one", "two", "three", "four")
    val numlist: MutableList<Int> = mutableListOf()

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        mlist.add(i.toString())
        numlist.add(i)
//        println("i = $i")
    }

    for (word in numlist) {
        println(" This is the  $word")
    }
}