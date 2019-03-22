package collections

val internships = List(1) { 5000 } + List(3) { 3000 } + List(6) { 1000 }

fun List<Student>.makeBestStudentsList(): String = this
        .filter { it.pointsInSemester >= 30 && it.result >= 80 }
        .sortedByDescending { it.result }
        .zip(internships)
        .sortedWith(compareBy({ (s, _) -> s.surname }, { (s, _) -> s.name }))
        .joinToString(separator = "\n") { (student, internship) ->
            "${student.name} ${student.surname}, \$$internship"
        }