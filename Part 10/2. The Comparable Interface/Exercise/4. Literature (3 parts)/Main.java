import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if(name.isEmpty()){
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name,age));
            System.out.println();
        }
        Comparator<Book> bookComparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books,bookComparator);
        System.out.println("\nBooks:");

        // for(Book b: books){
        //     System.out.println(b);
        // }

        // books.stream().sorted((b1,b2) -> {return b1.getAge() - b2.getAge();}).forEach(b -> System.out.println(b));

        for(Book b: books){
            System.out.println(b);
        }
    }
}