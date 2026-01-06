package leetcodeSolutions

/**
 * 69. Sqrt(x)
 * link: https://leetcode.com/problems/sqrtx
 */

fun mySqrt(x: Int): Int {
    if(x == 0) return 0

    var left = 1
    var right = x
    val longX = x.toLong()

    while(left <=right) {
        val mid = left + (right - left) / 2

        val square = mid.toLong() * mid.toLong()

        if(square == longX) {
            return mid
        } else if(square > longX) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }

    return right
}