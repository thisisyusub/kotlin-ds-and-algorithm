package leetcodeSolutions

/**
 * 35. Search Insert position
 * link: https://leetcode.com/problems/search-insert-position
 */

    fun searchInsert(nums: IntArray, target: Int): Int {
        var startIndex = 0
        var endIndex = nums.size - 1

        while (startIndex <= endIndex) {
            val mid = (startIndex + endIndex) / 2
            val currentMidValue = nums[mid]

            if (currentMidValue == target) {
                return mid
            }

            if (target < currentMidValue) {
                endIndex = mid - 1
            }

            if (target > currentMidValue) {
                startIndex = mid + 1
            }
        }

        return startIndex
    }