package leetcodeSolutions.nodes

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return if (next != null) {
            "$`val` -> ${next.toString()}"
        } else {
            "$`val`"
        }
    }
}