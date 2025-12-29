package leetcodeSolutions

/**
 * 28. Find the Index of the First Occurrence in a String
 * link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 */

class Solution28 {
    fun strStr(haystack: String, needle: String): Int {
        var i = 0
        var j = 0

        while(i < haystack.length && j <  needle.length) {

            if(haystack[i] == needle[j]) {
                i++
                j++
            } else {
                i = i - j + 1
                j = 0
            }
        }

        return if (j == needle.length) i - j else -1
    }
}