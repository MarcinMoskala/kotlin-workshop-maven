package basics

// TODO: Set separator default value to ", "
fun joinStrings(vararg texts: String, separator: String) =
        texts.joinToString(separator)

// TODO: Change separator to "."
//fun changeSeparator() = joinStrings("A", "B", "C")

fun main() {
    print("Hello, World")
}