data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

// objeto Person a un objeto Student
fun mapToStudent(person: Person): Student {
    return Student(person.name, person.age, person.gender, "ID-4567890")
}

fun main() {
    val persons = listOf(
        Person("Alicia", 25, "Femenino"),
        Person("Dani", 20, "Masculino"),
        Person("Renata", 19, "Femenino")
    )
    val students = persons.map { mapToStudent(it) }

    students.forEach { student ->
        println("El Estudiante ${student.name} tiene ${student.age} años")
    }
}
