package leetcodeSolutions

/**
 * 258. Add Digits
 * link: https://leetcode.com/problems/add-digits/
 */

fun addDigits(num: Int): Int {
    if(num == 0) return 0

    val result = num % 9
    return if(result == 0) 9 else result
}