package leetcodeSolutions

import java.util.Stack

/**
 * 20. Valid Parentheses
 * link: https://leetcode.com/problems/valid-parentheses
 */

    fun isValid(s: String): Boolean {
        if(s.isEmpty()) true

        val stack = Stack<Char>()

        for(index in 0 until s.length) {
            val currentChar = s[index]

            if(currentChar.isOpening()) {
                stack.push(currentChar)
            } else {
                if(stack.isEmpty()) return false

                val prevChar = stack.peek()

                if(prevChar.getComplement() == currentChar) {
                    stack.pop()
                } else {
                    break
                }
            }
        }

        return stack.isEmpty()
    }

    fun Char.isOpening(): Boolean = when(this) {
        '(', '[', '{' -> true
        else -> false
    }

    fun Char.getComplement(): Char {
        return when (this) {
            '(' -> ')'
            '[' -> ']'
            '{' -> '}'
            else -> throw IllegalArgumentException()
        }
    }