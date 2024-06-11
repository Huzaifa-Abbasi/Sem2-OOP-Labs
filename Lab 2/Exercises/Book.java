/*Create a class named Book with member variables for title, author, and genre. Write a method 
named displayDetails() that prints the book information. */
class books{
    String title, author, genre;

    public void displayDetails(String title, String author, String genre){
        System.out.println("Title: "+ title  );
        System.out.println("Author: "+author);
        System.out.println("Genre: "+ genre);

    }
}



public class Book {
    public static void main(String[] args) {
        books bk = new books();
        String title = "14 laws";
        String author = "Ali";
        String genre = "Knowledge";
        bk.displayDetails(title, author, genre);
    }
}
