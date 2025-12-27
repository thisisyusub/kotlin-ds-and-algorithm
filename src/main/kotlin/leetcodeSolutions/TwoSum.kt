package leetcodeSolutions

/**
 * 1. Two Sum
 * link: https://leetcode.com/problems/two-sum
 */

private class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for(i in nums.indices) {
            val currentNumber = nums[i]
            val complement = target - currentNumber

            if(map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }

            map[currentNumber] = i
        }

        return intArrayOf()
    }
}