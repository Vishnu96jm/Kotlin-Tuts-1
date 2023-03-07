

// Overriding

data class Grade1(val courseName: String, val letter: Char)

open class Person4(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

open class Student2(firstName: String, lastName: String,
                   var grades: MutableList<Grade1> = mutableListOf<Grade1>()
) : Person4(firstName, lastName) {

    open var isEligible: Boolean = true
    open fun recordGrade(grade: Grade1) {
        grades.add(grade)
    }
}

class BandMember1(firstName: String, lastName: String): Student2(firstName, lastName) {
    var minimumPracticeTime: Int = 2
    override fun recordGrade(grade: Grade1) {
        super.recordGrade(grade)
        isEligible = grades.none { it.letter == 'F' }
        if (!isEligible) println("No more performing for $firstName! Study study study.")
    }
}

class StudentAthlete1(firstName: String, lastName: String): Student2(firstName, lastName) {

    override fun recordGrade(grade: Grade1) {
        super.recordGrade(grade)
        /*We can filter the grades property to find all the Fs. And then find out if there
        * are less than three of them.  */
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if (!isEligible) println("$firstName can't play in the big game! Time to study.")
    }
}


fun main() {
    val victor = BandMember1("Victor", "Wooten")
    val marty = StudentAthlete1("Marty", "McWolf")

    val utterFailureGrade = Grade1(courseName = "Being a Regular Human", letter = 'F')

    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)

    victor.recordGrade(utterFailureGrade)
}