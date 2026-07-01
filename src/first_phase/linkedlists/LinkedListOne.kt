package first_phase.linkedlists

var currentNode: ListNode? = null

fun main(args: Array<String>) {

    for (value in 0 ..12) {
        addToNode(value)
    }

    traverseList()

}

fun addToNode(value: Int) {

    if (currentNode == null) {
        currentNode = ListNode(value, null)
//        println(" Adding value to node:  $value")
    } else {
//        println(" Adding value to node:  $value  and next:  ${currentNode?.value} .  and ${currentNode?.next?.value}")
        val newNode = ListNode(value, currentNode)
        currentNode = newNode
    }
}

fun traverseList() {

    if (currentNode == null) {
        println(" List is empty ")
        return
    }

    while (currentNode != null) {
        println(" Current node value :   ${currentNode?.value}")

        val nextNode = currentNode!!.next
        currentNode = nextNode
    }
}








data class ListNode(val value: Int?, var next: ListNode? = null)