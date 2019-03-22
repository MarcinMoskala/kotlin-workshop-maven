package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Caught $exception")
    }
    val job = Job()
    GlobalScope.launch(handler + job) {
        throw AssertionError()
    }
    job.join() // Caught java.lang.AssertionError
}