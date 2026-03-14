package dam.exer_v1

class PhysicalBook(title: String, author:String, year:Int, initialAvailableCopies: Int, val weight: Int, val hardcover: Boolean):Book(title,author,year,initialAvailableCopies) {
    override fun toString(): String {
        return "Title: $title, Author: $author, Launch Year: $publicationYear, Era: $bookEra, Available: $availableCopies Copies, \n" +
                "Storage: ${getStorageInfo()}"
    }

    override fun getStorageInfo(): String {
        var isHardcover = ""
        if(hardcover){
            isHardcover = "Yes"
        }else{
            isHardcover = "No"
        }
        return "Physical book: $weight, Hardcover: $isHardcover}"
    }
}