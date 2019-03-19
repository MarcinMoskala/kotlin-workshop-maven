package basics

interface Person {
    val name: String
    val age: Int

    // Always true when age >= 21
    val canBuyAlcohol: Boolean

    fun helloText(): String

    fun cheerText(person: Person): String
}

// TODO: Implement here class Businessman that implements Person
// TODO: Implement here class Student that implements Person

fun main(args: Array<String>) {
    val businessman: Person = TODO("Use Businessman constructor here once it is implemented")
    val student: Person = TODO("Use Businessman constructor here once it is implemented")

    println(businessman.helloText())
    println(student.helloText())

    println(businessman.cheerText(student))
    println(student.cheerText(businessman))

    fun sayIfCanBuyAlcohol(person: Person) {
        val modal = if(person.canBuyAlcohol) "can" else "can't"
        println("${businessman.name} $modal buy alcohol")
    }

    sayIfCanBuyAlcohol(businessman)
    sayIfCanBuyAlcohol(student)
}