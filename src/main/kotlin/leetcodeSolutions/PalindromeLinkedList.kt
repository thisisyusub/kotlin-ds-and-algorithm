package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 234. Palindrome Linked List
 * link: https://leetcode.com/problems/palindrome-linked-list
 */

fun isPalindrome(head: ListNode?): Boolean {
    val middleNode = middle(head)
    val headOfReversedSecondHalf = reverse(middleNode)

    var p = head
    var reversedP = headOfReversedSecondHalf

    while(p != middleNode) {
        if(p?.`val` != reversedP?.`val`) {
            return false
        }

        p = p?.next
        reversedP = reversedP?.next
    }

    return true
}

private fun middle(head: ListNode?): ListNode? {
    var slow = head
    var fast = head?.next

    while (fast != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

private fun reverse(head: ListNode?): ListNode? {
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