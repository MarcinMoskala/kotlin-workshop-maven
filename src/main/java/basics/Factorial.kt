package basics

// factorial(5) = 5! = 5 * 4 * 3 * 2 * 1 = 120
// https://en.wikipedia.org/wiki/Factorial
fun factorial(n: Int): Long = if(n <= 1) 1 else n * factorial(n - 1)