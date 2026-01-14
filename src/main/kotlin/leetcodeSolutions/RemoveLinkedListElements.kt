package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 203. Remove Linked List Elements
 * link: https://leetcode.com/problems/remove-linked-list-elements
 */

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val dummyHead = ListNode(-1)
    dummyHead.next = head

    var prev = dummyHead
    var current = dummyHead.next

    while (current != null) {
        if (current.`val` == `val`) {
            prev.next = current.next
            current.next = null
            current = prev.next
        } else {
            prev = current
            current = current.next
        }
    }

    return dummyHead.next
}