package basics

// factorial(5) = 5! = 5 * 4 * 3 * 2 * 1 = 120
// https://en.wikipedia.org/wiki/Factorial
tailrec fun factorial(n: Int, acc: Long = 1L): Long = if(n <= 1) acc else factorial(n - 1, acc * n)