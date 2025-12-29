package algorithms

fun main() {
    val numbers = listOf(3, 18, 4, 7, 2, 15)

    println("search for 7 index: ${numbers.linearSearch(7)}")
    println("search for 12 index: ${numbers.linearSearch(12)}")
}

fun <T> List<T>.linearSearch(`val`: T): Int {
    for (index in this.indices) {
        if (this[index] == `val`) {
            return index
        }
    }

    return -1
}