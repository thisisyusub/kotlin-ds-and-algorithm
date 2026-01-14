package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 876. Middle of the Linked List
 * link: https://leetcode.com/problems/middle-of-the-linked-list
 */

fun middleNode(head: ListNode?): ListNode? {
    var slow = head
    var fast = head?.next

    while (fast != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}