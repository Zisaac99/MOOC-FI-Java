import java.util.*;

public class Main{
    public static void main(String[] args){
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
}