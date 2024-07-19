import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        System.out.println(readBooks(scanner.nextLine()));
    }

    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<Book>();

        try{
            Files.lines(Paths.get(file))
            .map(row -> row.split(","))
            .filter(row -> row.length >= 4)
            .map(parts -> new Book(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),parts[3]))
            .forEach(book -> books.add(book));
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return books;
    }
}