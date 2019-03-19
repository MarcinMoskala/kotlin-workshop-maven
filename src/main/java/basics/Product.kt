package basics

fun product(iterable: Iterable<Int>): Int {
    var prod = 1
    for (i in iterable) {
        prod *= i
    }
    return prod
}

fun main() {
    // Is now:
    print(product(listOf(1,2,3))) // 6
    // Should be:
//    print(listOf(1,2,3).product())
}