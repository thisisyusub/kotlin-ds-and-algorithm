package leetcodeSolutions

import leetcodeSolutions.nodes.TreeNode

/**
 * 100. Same Tree
 * link: https://leetcode.com/problems/same-tree
 */

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    if (p.`val` != q.`val`) return false
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}