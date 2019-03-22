package dsl

fun loop(operation: (Long)->Unit) {
    var i = 0L
    while (true) {
        operation(i++)
    }
}

fun main() {
    loop {
//        if(it == 8L) lastRun()
        println(it)
    }
}