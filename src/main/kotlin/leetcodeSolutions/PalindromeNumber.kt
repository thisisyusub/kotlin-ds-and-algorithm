package leetcodeSolutions

/**
 * 9. Palindrome Number
 * link: https://leetcode.com/problems/palindrome-number
 */

/** for example, assume we check 742
 *
 *  n = 685 -> 68 -> 6
 *  reversed = 0 -> 5
 *
 *  1) 685 % 10 = 5
 *     reversed = (0 * 10) + 5 = 5
 *     n = 685 / 10 = 68
 *
 *  2) 68 % 10 = 8
 *     reversed = (5 * 10) + 8 = 58
 *     n = 68 / 10 = 6
 *
 *  3) 6 % 10 = 6
 *     reversed = (58 * 10) + 6 = 586
 *     n = 6 / 10 = 0
 *
 *   4) n = 0
 */

    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false

        var number = x
        var reversed = 0

        while(number > 0) {
            val modulo = number % 10
            reversed = (reversed * 10) + modulo
            number /= 10
        }

        return x == reversed
    }