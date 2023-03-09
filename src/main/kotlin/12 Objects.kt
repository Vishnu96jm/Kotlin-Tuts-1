

/*
* Objects:
 The Object keyword in Kotlin lets you define a type that only has a single instance, a named object.
 A type defined with object cannot have constructors.
*
* Objects can have properties and member functions
*
* Why might you want to use an object?
* The object keyword lets you easily implement the singleton pattern.*/

data class Student5(val id: Int, val firstName: String, val lastName: String) {
    var fullName = "$lastName, $firstName"
}

object StudentRegistry {
    val allStudents = mutableListOf<Student5>()

    //add student to the registry
    fun addStudent(student: Student5) {
        allStudents.add(student)
    }
    //remove them
    fun removeStudent(student: Student5) {
        allStudents.remove(student)
    }

    //print out all the students full names
    fun listAllStudents() {
        allStudents.forEach {
            println(it.fullName)
        }
    }
}

fun main() {

    val francisco = Student5(1, "Francisco", "Goya")
    val sal = Student5(2, "Salvador", "Dalí")
    val frida = Student5(3, "Frida", "Kahlo")

    /* Using a Kotlin object ensures that only one registry can be created.
    */
    StudentRegistry.addStudent(francisco)
    StudentRegistry.addStudent(sal)
    StudentRegistry.addStudent(frida)

    StudentRegistry.listAllStudents()
}