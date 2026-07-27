package first_phase.trees

import first_phase.string_contains_substring.findSubstring

var startNode: NodeTree? = null

fun main(args: Array<String>) {

//    val value = listOf<Int>(1, 2, 3, 4, 5)

    val values = mutableListOf<Int>()

    for (i in 1..15) {
        values.add(i)
    }

    values.forEach { value ->
        addToTree(value)
    }

    traverseAndPrintOne(startNode)

}

fun traverseAndPrintOne(node: NodeTree?) {
    if (node != null) {
        println(" Node value: ${node.value}  ")

        if (node.leftNodeTree != null) {
            traverseAndPrintOne(node.leftNodeTree)
        }

        if (node.rightNodeTree != null) {
            traverseAndPrintOne(node.rightNodeTree)
        }

    }
}

fun addToTree(value: Int): Unit {

    if (startNode == null) {
        println(" Adding to node  $value  to initial node. ")
        startNode = NodeTree(value)
    } else startNode?.let {
        addValueToNode(value, it)
    }

}

fun addValueToNode(value: Int, node: NodeTree) {

    if (node.leftNodeTree == null) {
        println(" Adding to node  $value  to  left.  And parent  is  ${node.value}")

        node.leftNodeTree = NodeTree(value)
    } else if (node.rightNodeTree == null) {
        println(" Adding to node  $value  to right.  And parent  is  ${node.value}")

        node.rightNodeTree = NodeTree(value)
    } else {
        addValueToNode(value, node.leftNodeTree!!)
    }
}


data class NodeTree(
    val value: Int,
    var leftNodeTree: NodeTree? = null,
    var rightNodeTree: NodeTree? = null,
)