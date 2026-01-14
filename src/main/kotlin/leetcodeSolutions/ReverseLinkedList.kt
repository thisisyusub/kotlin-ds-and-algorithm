package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 206. Reverse Linked List
 * link: https://leetcode.com/problems/reverse-linked-list
 */

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head

    while(curr != null) {
        val temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp
    }

    return prev
}