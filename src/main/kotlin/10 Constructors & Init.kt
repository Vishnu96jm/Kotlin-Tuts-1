

data class Grade4(val courseName: String, val letter: Char)

open class Student4(var firstName: String, var lastName: String,
                   var grades: MutableList<Grade4> = mutableListOf<Grade4>()) {

    init {
        println("Student init")
    }
    open fun recordGrade(grade: Grade4) {
        grades.add(grade)
    }
}


class BandMember4 (firstName: String, lastName: String): Student4(firstName, lastName) {
    var minimumPracticeTime: Int = 2
    var isEligible = true


    /*With the secondary constructor, we'll pass the names along to BandMember's own
    * primary constructor with 'this'.*/
    constructor(firstName: String, lastName: String, minimumPracticeTime: Int): this(firstName, lastName) {
        println("sec const 1")
        this.minimumPracticeTime = minimumPracticeTime
    }

    constructor(transfer: BandMember4): this(transfer.firstName, transfer.lastName, transfer.minimumPracticeTime) {
        grades = transfer.grades
        isEligible = grades.none { it.letter == 'F' }
        if (!isEligible) minimumPracticeTime += 1
        println("(transfer constructor) Practice for $minimumPracticeTime hours!")
    }

    init { //initializers
        if (!isEligible) minimumPracticeTime += 1
        println("(init) Practice for $minimumPracticeTime hours!")
    }




}

fun main() {
    val bill = BandMember4(firstName = "Bill", lastName = "S. Preston, Esq.")
    val ted = BandMember4(firstName = "Ted", lastName = "Theodore Logan", minimumPracticeTime = 7)

    bill.recordGrade(Grade4(courseName = "Motivational Speaking", letter = 'A'))
    bill.recordGrade(Grade4(courseName = "Guitar 101", letter = 'F'))

    //Transferring Bill
    val transferredBill = BandMember4(transfer = bill)

    println(transferredBill.grades)
}

/*
Task - Building a Class Hierarchy
Create a class named `Animal` that has…
1. a method named `speak()` that does nothing.
Create two `Animal` subclasses...
1. `WildAnimal` that...
  - has an `isPoisonous` property, that is a `Boolean`
2. `Pet` that...
  - has a stored property named `name`, that is a `String`
  - has a `play()` method that prints out a message
  - overrides `speak()` - It should print out a message
Create one subclass of your choice of `WildAnimal` or `Pet`.
 - override `speak()`
*/

