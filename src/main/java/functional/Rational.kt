package functional

data class RationalNumber(val numerator: Int, val denominator: Int) {

    operator fun plus(other: RationalNumber): RationalNumber =
            RationalNumber(1,1)

    operator fun times(other: RationalNumber): RationalNumber =
            RationalNumber(1,1)

}


fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

fun main() {
    val r1 = RationalNumber(1,2)
    val r2 = RationalNumber(1,3)

    r1 + r2 == RationalNumber(2,3)
    r1 * r2 == RationalNumber(1,6)
}