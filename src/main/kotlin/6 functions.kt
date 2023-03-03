


// Functions

fun main() {
    //Kotlin allows you to nest functions, one within another

    fun printHello(){
        println("Hello")
    }

    /*define parameters in function declaration and then you pass arguments while calling
    the function.*/
    fun printHello(name: String){
        /*a parameter of a function is a constant, so this means you cannot reassign it.*/
        // name = "Pete" (val cannot be reassigned)
        println("Hello $name")
    }

    //function parameter can have a default value
    /*fun printHello(name: String = "World"){
        //A parameter of a function is a constant
        println("Hello $name")
    }*/


    fun printHello(name: String, isVeteran: Boolean = false) {

        if (isVeteran) println("Hello $name! Thank you for your service.")
        else println("Hello $name")
    }

//  printHello("Sam")
//  printHello("Chris")
//  printHello()

    printHello("Sam")
    /*when calling the function, you can name one or more of its arguments. This is useful when working
    with functions that have many parameters listed. - named arguments*/
    printHello(name = "Sam")
    printHello("Sam", isVeteran = true)
    printHello(name = "Sam", isVeteran = true)
    printHello(isVeteran = true, name = "Sam")

    /// RETURNING DATA / VALUES FROM FUNCTIONS ///


    /*creating ranges can be done in different ways, and that’s a good use case for a function.
    Let’s create a function for ranges.

    it takes in two parameters: the start and the end of the range.
    Then it returns a range created with these parameters and it uses the return statement to do this.

      fun createRange(start: Int, end: Int) : IntRange {
        return start..end
    }*/

    /*Instead of using the regular block of code with a return statement, you can turn this entire function to an expression.
    To do this, click on the return statement. Then click the bulb icon. And select “Convert to expression body”*/
    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) = if (isHalfOpen) {
        start until end
    } else {
        start..end
    }

    fun printRange(range: IntRange) {
        for (number in range) print("$number \t")
        println()
    }

    val closedRange = createRange(1, 10)
    printRange(closedRange)

    //a half open range exclude the last number in the given range.
    val halfOpenRange = createRange(5, 10, true)
    printRange(halfOpenRange)

    /*
    The overloaded function must have:
    A different number of parameters, OR
    Different parameter types.*/

    /*
    * //Assignment
    * 1. Write a function to print the average of 3 numbers
    * 2. Write a function to print greater number of two given numbers
    * */

}