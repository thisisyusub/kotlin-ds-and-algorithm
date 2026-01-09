package dataStructures.nodes

data class TreeNode<T : Any>(
    val `val`: T,
    var left: TreeNode<T>?,
    var right: TreeNode<T>?,
)