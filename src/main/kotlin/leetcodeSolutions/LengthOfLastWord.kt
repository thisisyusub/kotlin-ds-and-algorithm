package leetcodeSolutions

/**
 * 58. Length of Last Word
 * link: https://leetcode.com/problems/length-of-last-word
 */

fun lengthOfLastWord(s: String): Int {
    var prevCounter = 0
    var currCounter = 0

    for(currentChar in s) {
        if(currentChar == ' ') {
            if(currCounter != 0) {
                prevCounter = currCounter
            }

            currCounter = 0
            continue
        }

        currCounter++
    }

    if(currCounter != 0) {
        prevCounter = currCounter
    }

    return prevCounter
}
