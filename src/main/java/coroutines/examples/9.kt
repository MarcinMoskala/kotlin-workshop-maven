package coroutines.examples

import kotlinx.coroutines.*
import java.util.*

suspend fun makeAsyncCalculations(): String = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    "The answer is ${one.await() + two.await()}"
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000)
    println("I am done")
    return 1
}

val random = Random()

suspend fun doSomethingUsefulTwo(): Int {
    delay(100)
    if (random.nextBoolean()) throw Error() else return 2
}

fun main() = runBlocking {
    val value = makeAsyncCalculations()
    println(value)
}