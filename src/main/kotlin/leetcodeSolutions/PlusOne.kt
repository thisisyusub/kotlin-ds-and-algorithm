package leetcodeSolutions

/**
 * 66. Plus one
 * link: https://leetcode.com/problems/plus-one
 */

fun plusOne(digits: IntArray): IntArray {
    println(digits.size)
    for (i in digits.size - 1 downTo 0) {
        val currValue = digits[i]

        if (currValue != 9) {
            digits[i] = currValue + 1
            return digits
        }

        digits[i] = 0
    }

    val newArray = IntArray(digits.size + 1)
    newArray[0] = 1
    return newArray
}