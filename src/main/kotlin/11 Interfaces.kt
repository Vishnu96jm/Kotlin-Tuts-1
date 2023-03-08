

// Interfaces

/*The keyword interface is followed by the name of the interface, followed by curly
* braces with the members of the interface inside.
* The interface doesn't have to contain any implementation. That means you can't
* instantiate a vehicle directly.
* You use interfaces to enforce methods and properties on other types.
* */
interface Vehicle {

    fun accelerate()
    fun stop()
}

class Unicycle: Vehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
        println("Weeeeee")
    }

    override fun stop() {
        peddling = false
        println("Noooooo")
    }
}

enum class Direction {
    LEFT, RIGHT
}


interface TurningVehicle: Vehicle {
    /*Methods declared in interfaces can contain default parameters just like
      methods declared in classes and top-level functions.*/
    fun turn(direction: Direction = Direction.RIGHT)
    fun description(): String
}

interface Spacey {
    val tribblesCount: Int
}

/*One class can only inherit from another single class. It's a single inheritance model.
* In contrast, though, a class can adopt as many interfaces as you'd like.
*/
interface SpaceVehicle: Vehicle, Spacey {
    /*Interfaces cannot themselves hold states*/
    val name: String
        get() = "SpaceVehicle"

    //interfaces can have implementations for properties and methods
    override fun accelerate() { println("Proceed to Hyperspace!") }
    override fun stop() { println("Whoa, slow down!") }
}

class LightFreighter: SpaceVehicle {
    override val tribblesCount: Int = 0

    var hyperdriveBusted: Boolean = false
    override fun stop() {
        hyperdriveBusted = true
        println("Hyperdrive Failure... again")
    }
}

class Starship: SpaceVehicle {
    override val tribblesCount: Int
        get() = Int.MAX_VALUE

    override val name: String
        get() = "Starship!"

    override fun accelerate() {
        println("Warp factor 9, please!")
    }

    override fun stop() {
        super.stop()
        println("That kind of hurt...")
    }
}

fun main() {
    val unicycle = Unicycle()
    unicycle.accelerate()
    unicycle.stop()

    val falcon = LightFreighter()
    falcon.accelerate()
    falcon.stop()

    val enterprise = Starship()
    enterprise.accelerate()
    enterprise.stop()
}
