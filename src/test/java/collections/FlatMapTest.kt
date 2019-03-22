package collections

import org.junit.Test
import kotlin.test.assertEquals

// TODO: Uncomment below line
import kotlin.collections.flatMap as stdlibFlatMap

class FlatMapTest {
    @Test
    fun check() {
        assertEquals(listOf(1, 11, 2, 12, 3, 13, 4, 14), (1..4).flatMap { listOf(it, it + 10) })

        val listOfLists = listOf(listOf(1,2,3), listOf(), listOf(4,5,6))
        assertEquals(listOf(1,2,3,4,5,6), listOfLists.flatMap { it })
    }
}