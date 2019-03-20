package basics

sealed class Tree {
    override fun toString(): String = when(this) {
        is Leaf -> value
        is Node -> "$left, $right"
    }
}
data class Leaf(val value: String): Tree()
data class Node(val left: Tree, val right: Tree): Tree()