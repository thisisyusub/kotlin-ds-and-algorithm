package leetcodeSolutions

import leetcodeSolutions.nodes.ListNode

/**
 * 83. Remove Duplicates from Sorted List
 * link: https://leetcode.com/problems/remove-duplicates-from-sorted-list
 */

fun deleteDuplicates(head: ListNode?): ListNode? {
    val dummyHead = ListNode(1000)

    var lastUniqueValue = 1000
    var currentDummy: ListNode? = dummyHead
    var current = head

    while(current != null) {
        if(current.`val` != lastUniqueValue) {
            lastUniqueValue = current.`val`

            currentDummy?.next = ListNode(current.`val`)
            currentDummy = currentDummy?.next
        }

        current = current.next
    }


    return dummyHead.next
}