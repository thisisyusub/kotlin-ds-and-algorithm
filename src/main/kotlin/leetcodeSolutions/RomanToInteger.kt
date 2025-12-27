package leetcodeSolutions

/**
 * 13. Roman to integer
 * link: https://leetcode.com/problems/roman-to-integer
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * LVIII -> 50 + 5 + 1 + 1 + 1 = 58
 * MCMXCIV -> 1000 + 100 + (1000 -100 * 2) + 10 + (100 - 10 * 2) + 1 + (5 - 1*2)
 */

class Solution13 {
    fun romanToInt(s: String): Int {
        var prevNumber: Int? = null
        var total = 0

        for (c in s) {
           val currentValue = getValue(c)

            if(prevNumber != null && currentValue > prevNumber) {
                total += currentValue - (prevNumber * 2)
            } else {
                total += currentValue
            }

            prevNumber = currentValue
        }

        return total
    }
}

fun getValue(char: Char): Int {
    return when (char) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}