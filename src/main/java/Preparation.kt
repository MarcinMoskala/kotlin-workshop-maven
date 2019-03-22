// Comments are...
/*
* ...the same as in Java
*/

fun main(args: Array<String>) { // This is a fully executable Hello World program
    print("Hello, World") // Hello, World
}

// Note that we can place functions and properties on the top level
val num = 10 // Type Int is inferred from the number on the right side
fun sum(a: Int, b: Int): Int {
    return a + b
}

// When a function has only one expression, we can use the shorter notation
fun sum2(a: Int, b: Int) = a + b // Inferred return type is Int

// it can be used as an expression, similar to a ternary operator
fun bigger(a: Int, b: Int) = if(a > b) a else b

class A {
    fun a() {
        print(num) // 10
        print(sum(1,2)) // 2
    }
}

fun mutability() {
    val a = 10 // val is read-only (final)
    // a = 20 // Cannot change val
    var b = 10 // var is mutable
    b = 20 // We can change var
}


fun nullability() {
    var a: String = "Str"
    // a = null // Error: String is not a nullable type. Use String?
    // Same with all other types. A is not nullable, A? is nullable
    var b: String? = "Str"
    b = null

    print(a.length)
    // print(b.length) // Error: We cannot directly use nullable types
    print(b?.length) // null
    b = "AAA"
    print(b?.length) // 3
}

class Person(
        var name: String,
        val surname: String
) {

    // Method
    fun getFullName() = "$name $surname" // String builder

    override fun toString(): String = "Person(name=$name, surname=$surname)"
}

fun personOperations() {
    val user = Person("Marcin", "Moskała") // No need for `new` operator
    print(user.name) // Marcin
    print(user.surname) // Moskała
    print(user.getFullName()) // Marcin Moskała
    user.name = "Martin"
    print(user.name) // Martin
    print(user.getFullName()) // Martin Moskała
}

fun loop() {
    for (i in 1..10) { print(i) } // 12345678910
}