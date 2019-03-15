package extra

import basics.factorial
import functional.product

/**
 *  Permutations are all different ways to arrange elements from some collection (https://en.wikipedia.org/wiki/Permutation).
 *  For sets it's number is n!, for lists it is n! / (n1! * n2! * ...) where n1, n2... are numbers elements that are the same.
 */

/* This function returns number of all permutations of elements from set. It is equal to n! where n is size of set. */
fun <T> Set<T>.permutationsNumber(): Long = factorial(size)

/* This function returns number of all permutations of elements from list. It is equal to n! / (n1! * n2! * ...) where n1, n2... are numbers elements that are the same. */
fun <T> List<T>.permutationsNumber(): Long = if (size < 1) 1L else factorial(size) / groupBy { it }.map {
    factorial(
        it.value.size
    )
}.product()

/* This function returns all permutations of elements from set. These are different ways to arrange elements from this list.  */
fun <T> Set<T>.permutations(): Set<List<T>> = TODO()

/* This function returns all permutations of elements from list. These are different ways to arrange elements from this list.  */
fun <T> List<T>.permutations(): Set<List<T>> = TODO()