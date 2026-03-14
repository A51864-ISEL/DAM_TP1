package dam.exer_v1

abstract class Book(val title: String, val author: String, val publicationYear: Int, initialAvailableCopies: Int) {
    val bookEra: String
        get(){
            if (publicationYear < 1980){
                return "Classic"
            }else if(publicationYear in 1980..2010){
                return "Modern"
            }else{
                return "Contemporary"
            }
        }

    //I cant put the variable directly in the constructor if I want getters or setters which means I had to create initialAvailableCopies to hold the original value but it will be assigned to availableCopies in the init
    var availableCopies: Int = initialAvailableCopies
        set(value) {
            if (value < 0) {
                println("Error: Cannot have negative copies.")
            } else {
                field = value // Update the actual value
                if (field == 0) {
                    println("Warning: $title is now out of stock!")
                }
            }
        }

    init {
        availableCopies = initialAvailableCopies
        println("The Book $title written by $author has been added to the library and is now available!")

    }

    abstract fun getStorageInfo():String
}