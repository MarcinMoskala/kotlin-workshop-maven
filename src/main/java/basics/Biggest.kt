package basics

import java.lang.Math.max

fun biggest(a: Int, b: Int, c: Int) = when {
    a > b && a > c -> a
    b > c -> b
    else -> c
}

fun biggest2(a: Int, b: Int, c: Int) = max(a, max(b, c))
fun biggest3(a: Int, b: Int, c: Int): Int = maxOf(a, b, c)
fun biggest4(a: Int, b: Int, c: Int): Int = listOf(a, b, c).max()!!