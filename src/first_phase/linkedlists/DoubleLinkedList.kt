package first_phase.linkedlists


var pointer: Node? = null

var securePointer: Node? = null

fun main(args: Array<String>) {

    val value = 4

    for (value in 0 .. 8) {
        addNode(value)
    }

//    traverseBackAndForth()
//    traverseTheList()
    traverseFixedTheList()
    removeNode(5)
    traverseFixedTheList()
    findNode(5)
}

fun addNode(value: Int) {

    if (pointer == null) {
        pointer = Node(value)
        securePointer = pointer
    } else {
        val newNode = Node(value, pointer)
        pointer!!.previous = newNode
        pointer = newNode
    }
}

fun removeNode(value: Int) {
    pointer = securePointer
    while (pointer != null) {

        if (pointer!!.value == value) {
            println(" \n\n  Removing node with value:   $value found at ${pointer!!.value} . \n\n")

            val previousNode = pointer!!.previous
            val nextNode = pointer!!.next

            nextNode!!.previous = previousNode
            previousNode?.next = nextNode
        }
        pointer = pointer!!.previous
    }
}

fun findNode(value: Int) {

    pointer = securePointer

    while (pointer != null) {
        if (pointer!!.value == value) {
            println(" \n\n Value  $value found at ${pointer!!.value}")
        }
        pointer = pointer!!.previous
    }
}

fun traverseBackAndForth() {

    var lastValidNode: Node? = null

    if (pointer == null) {
        println(" Empty list")
        return
    }

    while (pointer != null) {
        lastValidNode = pointer
        println(" Node value:  ${pointer!!.value}")
        pointer = pointer!!.next
    }

    println(" \n ***")

    while (lastValidNode != null) {
        println(" Node value:  ${lastValidNode.value}")
        lastValidNode = lastValidNode.previous
    }
}

fun traverseTheList() {
//    pointer = securePointer

    if (pointer == null) {
        println(" Linked list is empty")
        return
    }

    while (pointer != null) {
        println(" The value of this node is ${pointer?.value}")

        pointer = pointer?.next
    }
}

fun traverseFixedTheList() {
    pointer = securePointer

    if (pointer == null) {
        println(" Linked list is empty")
        return
    }

    while (pointer != null) {
        println(" The value of this node is ${pointer?.value}")

        pointer = pointer?.previous
    }
}


data class Node(val value: Int, var next: Node? = null, var previous: Node? = null)