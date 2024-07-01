import java.util.*;

public class Main{
    public static void main(String[] args){
        // Book bookObject = new Book("Book object", 2000, "...");
        // Book anotherBookObject = bookObject;

        // if (bookObject.equals(anotherBookObject)) {
        //     System.out.println("The books are the same");
        // } else {
        //     System.out.println("The books aren't the same");
        // }

        // // we now create an object with the same content that's nonetheless its own object
        // anotherBookObject = new Book("Book object", 2000, "...");

        // if (bookObject.equals(anotherBookObject)) {
        //     System.out.println("The books are the same");
        // } else {
        //     System.out.println("The books aren't the same");
        // }

        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }
}