import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        // if(checker.isDayOfWeek(string)){
        //     System.out.println("The form is correct.");
        // }else{
        //     System.out.println("The form is incorrect.");
        // }

        // if(checker.allVowels(string)){
        //     System.out.println("The form is correct.");
        // }else{
        //     System.out.println("The form is incorrect.");
        // }

        if(checker.timeOfDay(string)){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is incorrect.");
        }
    }
}