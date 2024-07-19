import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();

        while(true){
            System.out.println("\nContinue personal information input? quit ends:");
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            System.out.println("Input first name: ");
            // String firstName = scanner.nextLine();
            String firstName = scanner.nextLine();

            System.out.println("Input last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Input the year of birth: ");
            int YOB = Integer.valueOf(scanner.nextLine());

            persons.add(new Person(firstName, lastName, YOB));
        }


        System.out.println();
        System.out.println("Unique last names in alphabetical order:");
        persons.stream().map(person -> person.getLastName()).distinct().sorted().forEach(value -> System.out.println(value));
    }
}