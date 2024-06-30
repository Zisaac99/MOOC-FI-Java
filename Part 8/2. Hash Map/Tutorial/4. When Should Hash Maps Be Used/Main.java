import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        System.out.println(get(books, "Sense and Sensibility"));

        System.out.println();

        System.out.println(get(books, "Persuasion"));
    }

    public static Book get(ArrayList<Book> books, String name){
        for(Book book: books){
            if(book.getName().equals(name)){
                return book;
            }
        }

        return null;
    }
}