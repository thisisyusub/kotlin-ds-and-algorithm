package leetcodeSolutions

/**
 * 26. Remove Duplicates from Sorted Array
 * link: https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var uniqueIndex = 0
        var lastUniqueValue = nums[uniqueIndex]
        var uniqueCounter = 1

        for (currentIndex in 1 until nums.size) {
            val currentValue = nums[currentIndex]

            if (currentValue != lastUniqueValue) {
                uniqueIndex++
                nums[uniqueIndex] = currentValue
                lastUniqueValue = currentValue
                uniqueCounter++
            }
        }

        return uniqueCounter
    }