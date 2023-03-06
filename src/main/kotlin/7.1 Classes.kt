
/*A class is a defined group of data which is its own type.
Properties - state of the class
Methods - behavior of the class

* To create a class you need to use something called a constructor. A constructor is a special
* function for the class which creates an object of the class.*/

/*class Person{
    var name: String = ""
    var lastName: String? = null
    var age: Int = 0
}*/

/*class Person(name: String, lastName: String?, age: Int){
    var name: String = name
    var lastName: String? = lastName
    var age: Int = age
}*/

/*By adding val or var modifiers to the primary constructor parameters, you automatically turn
* them to class properties.*/
class Person(
    val name: String,
    val lastName: String?,
    var age: Int
)

fun main() {
    /*
    val filip = Person()

    filip.age = 23
    filip.name = "Filip"
    filip.lastName = "Babic"

    //By default, Kotlin prints out the type, and memory address of the object.
    println(filip)

    //To change that, format the data in the print function
    println("Name: ${filip.name}, Last name: ${filip.lastName}, Age: ${filip.age}")*/

    /*When you have properties in a class, you can define a constructor, which allows you
    * to pass in the data more easily.*/
    val filip = Person("Filip", "Babic", 23)
    val marin = Person("Marin", null, 23)

    println(filip)
    println("Name: ${filip.name}, Last name: ${filip.lastName}, Age: ${filip.age}")
    println("Name: ${marin.name}, Last name: ${marin.lastName}, Age: ${marin.age}")

    /*Objects are called a reference type. This means that each object is referencing a certain
    * memory address.*/
    val filipClone = filip
    println("----")
    println(filip)
    println(filipClone)

}