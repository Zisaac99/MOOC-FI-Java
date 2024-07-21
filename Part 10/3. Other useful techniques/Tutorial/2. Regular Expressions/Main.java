import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        if (number.matches("01[0-9]{7}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
    }
}