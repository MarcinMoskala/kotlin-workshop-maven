package functional

fun repeat(times: Int, operation: ()->Unit) {
    for (i in 1..times) {
        operation()
    }
}

fun loop(operation: ()->Unit) {
    while (true) operation()
}

fun main() {
    repeat(10) {
        print("A")
    }

    loop {
        print(".")
    }
}