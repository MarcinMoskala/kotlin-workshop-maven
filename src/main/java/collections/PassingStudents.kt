package collections

fun List<Student>.makePassingStudentsListText(): String = this
        .filter { it.pointsInSemester > 15 && it.result >= 50 }
        .sortedWith(compareBy({ it.surname }, { it.name }))
        .joinToString(separator = "\n") {
            "${it.name} ${it.surname}, ${it.result}"
        }