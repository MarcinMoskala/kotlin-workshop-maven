package basics

operator fun Tree.plus(tree: Tree): Tree = Node(this, tree)

fun Tree.count(): Int = when(this) {
    is Leaf -> 1
    is Node -> left.count() + right.count()
}

fun Tree.countAll(): Int = when(this) {
    is Leaf -> 1
    is Node -> left.countAll() + right.countAll() + 1
}

fun Tree.height(): Int = when(this) {
    is Leaf -> 1
    is Node -> maxOf(left.height(), right.height()) + 1
}

operator fun Tree.contains(name: String) : Boolean = when(this) {
    is Leaf -> this.value == name
    is Node -> left.contains(name) || right.contains(name)
}