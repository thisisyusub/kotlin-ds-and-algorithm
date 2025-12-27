package dataStructuresAndAlgorithms.linkedList

class LinkedListIterator<T : Any>(private val list: LinkedList<T>) : Iterator<T> {
    private var index = 0
    private var lastNode: Node<T>? = null

    override fun next(): T {
        if (index >= list.size) throw IndexOutOfBoundsException()

        lastNode = if (index == 0) {
            list.nodeAt(0)
        } else {
            lastNode?.next
        }

        index++
        return lastNode!!.value
    }

    override fun hasNext(): Boolean = index < list.size
}