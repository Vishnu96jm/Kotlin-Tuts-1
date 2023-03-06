
/*Encapsulation: Encapsulation is the process when you abstract away information in your classes or your code
    * in general, to hide away some key implementation details.*/

/*by adding the private key word in front of the property, you're saying that these properties cannot be accessed from
* anywhere outside this class.
*
* To access values, there is an old and common concept called getters and setters which allow you to control the values
* from outside the class using a special named functions get and set.
* */
class Person2(
    private val name: String,
    private val lastName: String?,
    private var age: Int,
    val pet: Pet
) {

    /*The functions you've declared within a class are also called methods.*/
    fun setAge(age: Int) {
            this.age = age
    }

    fun getAge() = age

    fun getFullInformation(): String {
        return "Full Name: $lastName, $name, Age: $age, Pet: ${pet.name}, ${pet.animalType}"
    }
}

class Pet(var name: String, val animalType: String)

fun main() {
    /*
    val filip = Person2("Filip", "Babic", 23)
    println(filip.getFullInformation())

    filip.setAge(75)
    println(filip.getAge())*/


    var dog = Pet("Jura", "Goldie/Husky/Labrador Mix!")
    /*In this example, you use an external variable named dog to pass in as the
    * pet object to the person.*/
    val filip = Person2("Filip", "Babic", 23, dog)

    println(filip.getFullInformation())

    filip.setAge(75)
    println(filip.getAge())

    /*To access the pet data, you can do it by chaining calls.*/
    println(filip.pet.name)

    /*
      * Task:
      *
      * Create a class which represents a Song, whichever you prefer the most.
      * Add appropriate properties to the class, e.g. "name", "genre", "length" if it's a movie or a song.
      *
      * Create a few objects of the class type, and print out their formatted data.
      * */

}