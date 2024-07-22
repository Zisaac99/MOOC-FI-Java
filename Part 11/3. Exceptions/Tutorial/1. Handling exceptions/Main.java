import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(readNumber(scanner));
    }

    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Give a number: ");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input was not a number.");
            }
        }
    }
}