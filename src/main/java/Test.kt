package test

operator fun String.component1() = get(0)
operator fun String.component2() = get(1)

fun main() {
    val (first, second) = "AB"
    println(first)
    println(second)
}