package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 141. Linked List Cycle
 * link: https://leetcode.com/problems/linked-list-cycle
 */

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    while(fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast?.next?.next

        if(slow == fast) {
            return true
        }
    }

    return false
}