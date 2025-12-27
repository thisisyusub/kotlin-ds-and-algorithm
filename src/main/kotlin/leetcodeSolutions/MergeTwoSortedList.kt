package leetcodeSolutions

/**
 * 21. Merge Two Sorted List
 * link: https://leetcode.com/problems/merge-two-sorted-lists
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution21 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null) return list2
        if (list2 == null) return list1

        val fakeHead = ListNode(-1)

        var currentIterator = fakeHead
        var list1Iterator = list1
        var list2Iterator = list2

        while(list1Iterator != null && list2Iterator != null) {
            if(list1Iterator.`val` < list2Iterator.`val`) {
                currentIterator.next = list1Iterator
                list1Iterator = list1Iterator.next
            } else {
                currentIterator.next = list2Iterator
                list2Iterator = list2Iterator.next
            }

            currentIterator = currentIterator.next!!
        }

        if(list1Iterator != null) {
            currentIterator.next = list1Iterator
        } else if(list2Iterator != null) {
            currentIterator.next = list2Iterator
        }

        return fakeHead.next
    }
}