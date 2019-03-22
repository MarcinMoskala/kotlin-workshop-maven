import java.util.*

fun <A, B> pair(a: A, b: B): Pair<A, B> = Pair(a, b)

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

fun main() {
    print(Pair(1, "A")) // (1, A)
    print(1.to("A"))     // (1, A)
    print(1 to "A")     // (1, A)
    print(pair(1, "A")) // (1, A)

    for (i in 1..10 step 2) {

    }

    for (i in 10 downTo 1) {

    }

    for (i in 1 until 10) {

    }

    val number = Random().nextInt(200) - 50

    val coerced = number.coerceIn(0, 100)

    (1..1000).random()
}