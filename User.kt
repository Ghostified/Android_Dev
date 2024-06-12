
//Primary constructor
    data class User(@JvmField var firstName: String?, @JvmField var lastName: String? = null)

//Instance of the classes
val user3 = User ("Jane ", "Doe")
val user4 = User ("Jane", "Doe")

//Operators == reps equalstore
//=== checks if two references checks two objects

val structurallyEqual = user3 == user4 // returns true
val referentiallyEqual = user4 === user3 // returns falser

val john = User (firstName =   "John", lastName =  "Humphrey" )
val james = User (firstName = "James ", lastName = "Potter")
val hermione = User (firstName = "Hermione ", lastName = "Granger")
val ron = User (firstName = "Ron", lastName = "Weasly")

