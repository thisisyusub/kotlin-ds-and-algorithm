package leetcodeSolutions

/**
 * 70. Climbing Stairs
 * link: https://leetcode.com/problems/climbing-stairs
 */

private val memo = IntArray(46)

fun climbStairs(n: Int): Int {
    if(n <= 2) return n

    if(memo[n] != 0) {
        return memo[n]
    }

    memo[n] = climbStairs(n - 1) + climbStairs(n - 2)
    return memo[n]
}