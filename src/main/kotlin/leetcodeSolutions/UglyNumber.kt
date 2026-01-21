package leetcodeSolutions

/**
 * 263. Ugly Number
 * link: https://leetcode.com/problems/ugly-number
 *
 * An ugly number is a positive integer which does not
 * have a prime factor other than 2, 3, and 5.
 */

fun isUgly(n: Int): Boolean {
    if(n <= 0) return false

    var reminder = n

    while (true) {
        if (reminder % 2 == 0) {
            reminder /= 2
        } else if (reminder % 3 == 0) {
            reminder /= 3
        } else if (reminder % 5 == 0) {
            reminder /= 5
        } else {
            break
        }
    }

    return reminder == 1
}