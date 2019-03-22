package basics

data class Pizza(
        val cheese: Int = 0,
        val pineapple: Int = 0,
        val ham: Int = 0,
        val egg: Int = 0,
        val spinach: Int = 0
) {

    companion object {
        fun hawaiian() = Pizza(cheese = 1, pineapple = 1, ham = 1)
    }
}

fun main() {
    val pizza = Pizza.hawaiian()

    print(pizza == Pizza(cheese = 1, pineapple = 1, ham = 1))
}