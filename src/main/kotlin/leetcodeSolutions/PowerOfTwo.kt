package leetcodeSolutions

/**
 * 231. Power of two
 * link: https://leetcode.com/problems/power-of-two
 */

fun isPowerOfTwo(n: Int): Boolean {
    return  n > 0 && (n or (n - 1)) == 0
}