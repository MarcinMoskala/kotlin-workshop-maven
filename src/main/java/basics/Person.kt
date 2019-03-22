package basics

interface Person {
    val name: String
    val age: Int

    // Always true when age >= 21
    val canBuyAlcohol: Boolean
        get() = age >= 21

    fun helloText(): String

    fun cheerText(person: Person): String
}

class Businessman(
        override val name: String,
        override val age: Int
) : Person {

    override fun helloText(): String = "Good morning"

    override fun cheerText(person: Person): String =
            "Hello, my name is $name, nice to see you ${person.name}"
}

class Student(
        override val name: String,
        override val age: Int
) : Person {

    override fun helloText(): String = "Hi"

    override fun cheerText(person: Person): String =
            "Hey ${person.name}, I am $name"
}

fun main() {
    val businessman: Person = Businessman("John", 32)
    val student: Person = Student("Jake", 23)

    println(businessman.helloText())
    println(student.helloText())

    println(businessman.cheerText(student))
    println(student.cheerText(businessman))

    fun sayIfCanBuyAlcohol(person: Person) {
        val modal = if (person.canBuyAlcohol) "can" else "can't"
        println("${person.name} $modal buy alcohol")
    }

    sayIfCanBuyAlcohol(businessman)
    sayIfCanBuyAlcohol(student)
}