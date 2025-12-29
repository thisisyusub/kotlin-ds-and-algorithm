package dataStructures.singlyLinkedList

class LinkedList<T : Any> : Iterable<T>, Collection<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override fun isEmpty(): Boolean = size == 0

    override var size: Int = 0
        private set

    fun addToHead(value: T) {
        /// this code makes new value as head node
        /// and previous head node as next node
        head = Node(value = value, next = head)

        /// and we check if it is the first element
        /// for our list or not
        if (tail == null) {
            tail = head
        }

        size++
    }

    /// Complexity: O(1)
    fun addToTail(value: T) {
        val newTail = Node(value = value, next = null)
        /// if list is empty, new node is added
        /// as [head] and [tail]
        if (isEmpty()) {
            head = newTail
            tail = head
        }

        /// first we assign new tail node to next
        /// of previous tail node
        tail?.next = newTail

        /// and at the end our new node is tail node
        tail = newTail

        size++
    }

    /// Complexity: O(n)
    fun insertAt(index: Int, value: T) {
        require(index > 0, lazyMessage = { "Index should be larger than zero" })

        /// first we should search for previous index-node
        /// from requested index
        val currentNode = nodeAt(index)

        /// adding new node and assign next element to it
        val newNode = Node(value = value, next = currentNode?.next)

        /// changing the pointer of previous node to new node
        currentNode?.next = newNode

        size++
    }

    /// Complexity: O(1)
    fun removeFirst(): T? {
        if (isEmpty()) return null


        val value = head?.value

        /// new head is the next node
        head = head?.next

        /// if it is only single element of list
        /// tail is referencing this node yet
        /// so we should remove tail pointer too
        if (isEmpty()) {
            tail = null
        }


        size--
        return value
    }

    /// Complexity: O(n)
    fun removeLast(): T? {
        if (isEmpty()) return null

        if (head == tail) {
            return removeFirst()
        }


        var current = head
        var next = head?.next

        while (next?.next != null) {
            current = next
            next = next.next
        }

        current?.next = null
        tail = current

        size--
        return next?.value
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }


    /// Complexity: O(n)
    fun printList() {
        println(toString())
    }


    /// Complexity: O(n)
    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    override fun iterator(): Iterator<T> = LinkedListIterator(this)

    /// Complexity: O(n^2)
    override fun containsAll(elements: Collection<T>): Boolean {
        for (value in elements) {
            if (!contains(value)) return false
        }

        return true
    }

    /// Complexity: O(n)
    override fun contains(element: T): Boolean {
        for (value in this) {
            if (value == element) return true
        }

        return false
    }
}