
/*

Nullable types:
Nullable types are types which allow you to use null to represent a constant or variable.
If a value is not marked with a nullable type, it cannot be null. You get a compile time
error if you try to assign null to it.

To create a nullable type and values,
val money : Int? = null (This value may not exist and you can assign null to it)
* */
fun main(args : Array<String>) {
  val myName = "Vishnu"
  val nickname: String? = null
  val lastName: String? = null

  val myNameLength = myName.length
  val nicknameLen = nickname?.length?.toDouble()

  //Elvis operator ?:
  /*It returns the left-hand side if the value is not null and the right-hand side if it is null.*/
  val myNickname = nickname ?: myName
  println(myNickname)

  println(nicknameLen)
  println(nickname)

  if(lastName != null) {
    /*lastName.length - you don't need to put question mark before the dot operator
    when accessing the length of the String because Kotin has smart casted it.*/
    println("My last name is is ${lastName.length} characters long!")
  } else {
    println("I don't have a last name!")
  }

  /*
  * nickname?.isEmpty() == true -> This expression will always return a Boolean value*/
  if(nickname?.isEmpty() == true) {
    println("You don't have a nickname! Its length is: ${nickname.length}")
  }
}