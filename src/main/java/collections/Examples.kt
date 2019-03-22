package collections

// To prevent unintentional stdlib functions usage
import kotlin.collections.flatMap as stdlibFlatMap
import kotlin.collections.forEach as stdlibForEach
import kotlin.collections.map as stdlibMap
import kotlin.collections.filter as stdlibFilter

inline fun <T> Iterable<T>.onEach(operation: (T) -> Unit): Iterable<T> {
    for (elem in this) {
        operation(elem)
    }
    return this
}

inline fun <T, R> Iterable<T>.map(transformation: (T) -> R): List<R> {
    val list = arrayListOf<R>()
    for (elem in this) {
        list.add(transformation(elem))
    }
    return list
}

inline fun <T, R> Iterable<T>.flatMap(transformation: (T) -> Iterable<R>): List<R> {
    val list = arrayListOf<R>()
    for (elem in this) {
        list.addAll(transformation(elem))
    }
    return list
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val list = arrayListOf<T>()
    for (elem in this) {
        if (predicate(elem)) {
            list.add(elem)
        }
    }
    return list
}

fun main(args: Array<String>) {
    print((1..10).map { it * 2 }) // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
    print((1..10).filter { it % 3 == 0 }) // [3, 6, 9]
    print((1..10).map { it * 2 }.filter { it % 3 == 0 }) // [6, 12, 18]

    print((1..4).flatMap { listOf(it, it + 10) }) // [1, 11, 2, 12, 3, 13, 4, 14]
}