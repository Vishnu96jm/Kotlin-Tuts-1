
/*With class inheritance, a class can use the properties, methods, and even constructors
* from another existing class.
*
* Interfaces define a set of requirements that a type must meet.*/


// Inheritance

data class Grade(val courseName: String, val letter: Char, val credits: Double)

open class Person1(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

/*While not every person is a student, every student is a person*/
open class Student1(firstName: String, lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()
) : Person1(firstName, lastName) {

    fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

class BandMember(firstName: String, lastName: String): Student1(firstName, lastName) {
    var minimumPracticeTime: Int = 2
}

class StudentAthlete(firstName: String, lastName: String): Student1(firstName, lastName) {
    var isEligible: Boolean = true
}

fun main() {
    val jon = Person1(firstName = "Jon", lastName = "Snon")
    val jane = Student1(firstName = "Jane", lastName = "Snane")
    val victor = BandMember(firstName = "Victor", lastName = "Wooten")
    val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")

    println(jon.fullName())
    println(jane.fullName())

    println("${victor.fullName()} practices for ${victor.minimumPracticeTime} hours!")
    println("Can ${marty.fullName()} play in the big game: ${marty.isEligible}")

    val robotics = Grade(courseName = "Robotics", letter = 'B', credits = 3.0)

    jane.recordGrade(robotics)
    println(jane.grades)


}
