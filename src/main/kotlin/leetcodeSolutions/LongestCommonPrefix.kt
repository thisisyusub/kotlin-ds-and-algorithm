package leetcodeSolutions

/**
 * 14. Longest Common Prefix
 * link: https://leetcode.com/problems/longest-common-prefix
 */

class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        strs.sort()

        val first = strs[0]
        val last = strs[strs.size - 1]

        var index = 0
        var prefixBuilder = StringBuilder()


        while(index < first.length && index < last.length) {
            if(first[index] == last[index]) {
                prefixBuilder.append("${first[index]}")
                index++

            } else {
                break
            }
        }

        return prefixBuilder.toString()
    }
}