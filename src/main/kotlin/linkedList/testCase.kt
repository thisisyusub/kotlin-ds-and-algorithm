package linkedList

fun main() {
    val list = LinkedList<Int>()

    list.printList()

    list.addToHead(10)
    list.addToHead(15)
    list.addToHead(7)
    list.printList() /// 7 -> 15 -> 10

    /// after iterator implementation we can use
    /// our list in for each loops

    for (value in list) {
        println("in loop: $value")
    }

    list.addToTail(20)
    list.printList() // 7 -> 15 -> 10 -> 20
    list.addToTail(37)
    list.printList() // 7 -> 15 -> 10 -> 20 -> 37

    list.insertAt(index = 3, value = 13)
    list.printList() // 7 -> 15 -> 10 -> 20 -> 13 -> 37

    list.removeFirst()
    list.printList() // 15 -> 10 -> 20 -> 13 -> 37
    list.removeFirst()
    list.printList() // 10 -> 20 -> 13 -> 37

    list.removeLast()
    list.printList() // 10 -> 20 -> 13
    list.removeLast()
    list.printList() // 10 -> 20
    list.removeLast()
    list.printList() // 10
    list.removeLast()
    list.printList() // Empty list
}