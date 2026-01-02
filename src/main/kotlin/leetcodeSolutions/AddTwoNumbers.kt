package leetcodeSolutions

/**
 * 2. Add Two Numbers
 * link: https://leetcode.com/problems/add-two-numbers
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummyHead = ListNode(0)

    var current = dummyHead
    var p1 = l1
    var p2 = l2
    var rem = 0

    while (p1 != null || p2 != null || rem != 0) {
        val currentL1 = p1?.`val` ?: 0
        val currentL2 = p2?.`val` ?: 0

        val sum = currentL1 + currentL2 + rem

        rem = sum / 10
        current.next = ListNode(sum % 10)
        current = current.next!!

        p1 = p1?.next
        p2 = p2?.next
    }

    return dummyHead.next
}