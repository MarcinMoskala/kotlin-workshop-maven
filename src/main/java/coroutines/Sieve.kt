package coroutines

val primes: Sequence<Int> = sequence {
    var restOfNumbers = generateSequence(2) { it + 1 }

    while (true) {
        val nextPrimeNumber: Int = restOfNumbers.first()
        yield(nextPrimeNumber)
        restOfNumbers = restOfNumbers.filter { it % nextPrimeNumber != 0 }
    }
}

public fun <T> Sequence<T>.first(): T {
    val iterator = iterator()
    return iterator.next()
}

fun main() {
    primes.first()

}