package dataStructuresAndAlgorithms.linkedList

data class Node<T: Any>(
    val value: T,
    var next: Node<T>?,
) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}