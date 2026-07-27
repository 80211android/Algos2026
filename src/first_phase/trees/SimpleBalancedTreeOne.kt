package first_phase.trees


var startNodde: TheNodeTree? = null

var leadTracker: TheNodeTree? = null

fun main(args: Array<String>) {

//    val value = listOf<Int>(1, 2, 3, 4, 5)

    val values = mutableListOf<Int>()

    for (i in 1..15) {
        values.add(i)
    }

    values.forEach { value ->
        addToTheTree(value)
    }

    traverseAndPrintsOne(startNodde)

}

fun traverseAndPrintsOne(node: TheNodeTree?) {
    if (node != null) {
        println(" Node value: ${node.value}  ")

        if (node.leftNodeTree != null) {
            traverseAndPrintsOne(node.leftNodeTree)
        }

        if (node.rightNodeTree != null) {
            traverseAndPrintsOne(node.rightNodeTree)
        }

    }
}

fun addToTheTree(value: Int): Unit {

    if (startNodde == null) {
        println(" Adding to node  $value  to initial node. ")
        startNodde = TheNodeTree(value)
        leadTracker = startNodde
    } else startNodde?.let {
        addValueToNode(value, it)
    }

}

fun addValueToNode(value: Int, node: TheNodeTree, balanceFlag: Boolean = false) {

    if (node.leftNodeTree == null && balanceFlag == false) {
        println(" Adding to node  $value  to  left.  And parent  is  ${node.value}")

        node.leftNodeTree = TheNodeTree(value)
    } else if (node.rightNodeTree == null && balanceFlag == false) {
        println(" Adding to node  $value  to right.  And parent  is  ${node.value}")

        node.rightNodeTree = TheNodeTree(value)
    } else if (node.rightNodeTree != null && balanceFlag == true) {
        println(" Adding to node  $value  to right.  And parent  is  ${node.value}")

        addValueToNode(value, node.rightNodeTree!!)
    }

    else {
        addValueToNode(value, leadTracker!!, true)
    }
}


data class TheNodeTree(
    val value: Int,
    var leftNodeTree: TheNodeTree? = null,
    var rightNodeTree: TheNodeTree? = null,
)