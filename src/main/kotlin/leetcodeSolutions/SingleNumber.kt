package leetcodeSolutions

/**
 * 136. Single Number
 * link: https://leetcode.com/problems/single-number
 */

fun singleNumber(nums: IntArray): Int {
    var xorResult = 0

    for(num in nums) {
        xorResult = xorResult.xor(num)
    }

    return xorResult
}