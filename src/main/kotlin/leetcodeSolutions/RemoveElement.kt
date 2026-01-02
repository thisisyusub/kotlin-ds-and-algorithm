package leetcodeSolutions

/**
 * 27. Remove element
 * link: https://leetcode.com/problems/remove-element
 */

    fun removeElement(nums: IntArray, `val`: Int): Int {
      var left = 0
      var right = nums.size - 1

      while(left <= right) {
          if(nums[left] != `val`) {
              left++
              continue
          }

          if(nums[right] == `val`) {
              right--
              continue
          }

          nums[left] = nums[right]
          left++
          right--
      }

        return left
}