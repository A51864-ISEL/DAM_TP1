package dam.exer_v1

class Library(libraryName:String) {
    private var books = mutableListOf<Book>()

    fun addBook(book: Book) {
        totalBooksRegistered++
        books.add(book)
        println("${book.title} added to the library.")
    }

    fun borrowBook(title:String){
        val book = books.find { it.title == title }
        if (book != null){
            if (book.availableCopies > 0){
                book.availableCopies--
                println("You borrowed the book titled: $title. ${book.availableCopies} copies remaining")
            }else{
                println("There are no available copies of this book to borrow")
            }
        }else{
            println("WARNING: The book titled $title was not found in our library")
        }
    }

    fun returnBook(title: String){
        val book = books.find { it.title == title }
        if(book!=null){
            book.availableCopies++
            println("The Book titled $title was returned and is now available for the next person to borrow. ${book.availableCopies} copies remaining")
        }else{
            println("WARNING: The book titled $title was not found in our library. Tip: Try creating a new book first and registering it in the library")
        }
    }

    fun showBooks(){
        println("--- Library Catalog ---")
        for(book in books){
            println(book.toString())
            println()
        }
    }

    fun searchByAuthor(author: String){
        val booksByAuthor = books.filter { it.author == author }
        println("Books by $author")
        for(bookAuthored in booksByAuthor){
            println("    - ${bookAuthored.title} (${bookAuthored.bookEra}, ${bookAuthored.availableCopies} copies available)")
        }
    }

    companion object{
        private var totalBooksRegistered = 0

        fun getTotalBooksCreated(): Int {
            return totalBooksRegistered
        }
    }
}