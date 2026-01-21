package leetcodeSolutions

/**
 * 268. Missing Number
 * link: https://leetcode.com/problems/missing-number
 */

fun missingNumber(nums: IntArray): Int {
    val size = nums.size
    val missingSum = (size * (size + 1)) / 2
    var currentSum = 0

    for (num in nums) {
        currentSum += num
    }

    return missingSum - currentSum
}