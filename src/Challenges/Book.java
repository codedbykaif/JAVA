package Challenges;
class Book {
     static int totalNoOfBooks;
     String author;
     String title;
     String isbn;
     boolean isBorrowed;

     static{
         totalNoOfBooks = 0;

     }
    {  //object init
        totalNoOfBooks++;
    }
     Book(String isbn, String title, String author){
         this.isbn = isbn;
         this.title = title;
         this.author = author;
     }

     Book(String isbn){
         this(isbn, "Unknown", "Unknown");

     }
     static int getTotalNoOfBooks(){
         return totalNoOfBooks;
     }
     void borrowBook(){
         if(isBorrowed){
             System.out.println("Book is already Borrowed");
         } else {
             this.isBorrowed = true;
             System.out.println("Enjoy the book");
         }
     }
     void retrunBook(){
         if(isBorrowed){
             this.isBorrowed = false;
             System.out.println("Hope you enjoyed the book, please leave a review");
         } else{
             System.out.println("This book is already in the library");
         }
     }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.retrunBook();
        designOfThings.retrunBook();

    }
}
