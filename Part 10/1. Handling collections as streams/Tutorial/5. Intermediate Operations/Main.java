import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        // suppose we have a list of persons
        // ArrayList<Person> persons = new ArrayList<>();

        // Problem 1: You'll receive a list of persons. Print the number of persons born before the year 1970.
        long count = persons.stream()
            .filter(person -> person.getBirthYear() < 1970)
            .count();
        System.out.println("Count: " + count);



        // Problem 2: You'll receive a list of persons. How many persons' first names start with the letter "A"?
        long count = persons.stream()
            .filter(person -> person.getFirstName().startsWith("A"))
            .count();
        System.out.println("Count: " + count);



        // Problem 3: You'll receive a list of persons. Print the number of unique first names in alphabetical order
        persons.stream()
        .map(person -> person.getFirstName())
        .distinct()
        .sorted()
        .forEach(name -> System.out.println(name));
    }
}