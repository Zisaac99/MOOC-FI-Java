import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        // let's assume that we have a list of books
        // List<Book> books = new ArrayList<>();

        double average = books.stream()
            .map(book -> book.getAuthor())
            .mapToInt(author -> author.getBirthYear())
            .average()
            .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);

        // the mapping of a book to an author could also be done with a single map call
        // double average = books.stream()
        //     .mapToInt(book -> book.getAuthor().getBirthYear())
        //     ...


        // let's assume that we have a list of books
        // List<Book> books = new ArrayList<>();

        books.stream()
            .filter(book -> book.getName().contains("Potter"))
            .map(book -> book.getAuthor())
            .forEach(author -> System.out.println(author));
            }
}