package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 160. Intersection of Two Linked Lists
 * link: https://leetcode.com/problems/intersection-of-two-linked-lists
 */

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) return null

    var pA = headA
    var pB = headB

    while (pA != pB) {
        if (pA == null) {
            pA = headB
        } else {
            pA = pA?.next
        }

        if (pB == null) {
            pB = headA
        } else {
            pB = pB?.next
        }
    }

    return pA
}