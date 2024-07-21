import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        // String numbers = "";
        // for (int i = 1; i < 5; i++) {
        //     numbers = numbers + i;
        // }
        // System.out.println(numbers);

        // String numbers = ""; // creating a new string: ""
        // int i = 1;
        // numbers = numbers + i; // creating a new string: "1"
        // i++;
        // numbers = numbers + i; // creating a new string: "12"
        // i++;
        // numbers = numbers + i; // creating a new string: "123"
        // i++;
        // numbers = numbers + i; // creating a new string: "1234"
        // i++;

        // System.out.println(numbers); // printing the string



        // String numbers = "";
        // for (int i = 1; i < 5; i++) {
        //     numbers = numbers + i + "\n";
        // }
        // System.out.println(numbers);

        // String numbers = ""; // creating a new string: ""
        // int i = 1;
        // // first creating the string "1" and then the string "1\n"
        // numbers = numbers + i + "\n";
        // i++;
        // // first creating the string "1\n2" and then the string "1\n2\n"
        // numbers = numbers + i + "\n"
        // i++;
        // // first creating the string "1\n2\n3" and then the string "1\n2\n3\n"
        // numbers = numbers + i + "\n"
        // i++;
        // // and so on
        // numbers = numbers + i + "\n"
        // i++;

        // System.out.println(numbers); // outputting the string



        StringBuilder numbers = new StringBuilder();

        for(int i = 1; i < 5; i++){
            numbers.append(i);
        }

        System.out.println(numbers.toString());
    }
}