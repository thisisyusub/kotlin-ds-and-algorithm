package leetcodeSolutions

/**
 * 67. Add Binary
 * link: https://leetcode.com/problems/add-binary
 */

fun addBinary(a: String, b: String): String {
    var aIndex = a.length - 1
    var bIndex = b.length - 1

    var rem = 0
    val sum = StringBuilder()

    while (aIndex >= 0 || bIndex >= 0) {
        val currA = if (aIndex < 0) 0 else a[aIndex].toBinary()
        val currB = if (bIndex < 0) 0 else b[bIndex].toBinary()

        val currSum = currA + currB + rem

        sum.append(currSum % 2)
        rem = currSum / 2

        aIndex--
        bIndex--
    }

    if(rem != 0) {
        sum.append(1)
    }

    return sum.reversed().toString()
}

fun Char.toBinary(): Byte = when (this) {
    '1' -> 1
    '0' -> 0
    else -> throw IllegalArgumentException()
}