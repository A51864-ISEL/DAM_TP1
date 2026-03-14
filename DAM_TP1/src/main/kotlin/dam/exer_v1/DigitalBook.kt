package dam.exer_v1

class DigitalBook(title: String, author:String, year:Int, initialAvailableCopies: Int, val fileSize: Double, val format: String):Book(title,author,year, initialAvailableCopies){ //Note: Digital books never go out of stock



    override fun toString(): String {
        return "Title: $title, Author: $author, Launch Year: $publicationYear, Era: $bookEra, Available: $availableCopies Copies, \n" +
                "Storage: ${getStorageInfo()}"
    }

    override fun getStorageInfo(): String {
        return "Stored Digitally: $fileSize, Format: $format"
    }

}