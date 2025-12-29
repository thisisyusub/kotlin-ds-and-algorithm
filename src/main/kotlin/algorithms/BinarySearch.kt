package algorithms

fun main() {
    val numbers = listOf(2, 3, 4, 7, 15, 18)

    println(numbers.binarySearch(2))
    println(numbers.binarySearch(3))
    println(numbers.binarySearch(4))
    println(numbers.binarySearch(7))
    println(numbers.binarySearch(15))
    println(numbers.binarySearch(18))
    println(numbers.binarySearch(12))
}

/**
 * Binary search algorithm on generic items
 *
 * it requires only ordered list of items!
 */
fun List<Int>.binarySearch(`val`: Int): Int {
    var lowerBound = 0
    var upperBound = this.size

    while (lowerBound <= upperBound) {
        val mid = (lowerBound + upperBound) / 2
        val valueOfMid = this[mid]

        if (valueOfMid == `val`) {
            return mid
        }

        if (`val` < valueOfMid) {
            upperBound = mid - 1
        }

        if (`val` > valueOfMid) {
            lowerBound = mid + 1
        }
    }

    return -1
}