package coroutines

val fibonacci = sequence<Int> {
    yield(1)
    yield(1)

    var a = 1
    var b = 1
    while (true) {
        val temp = b
        b = a
        a += temp
        yield(a)
    }
}