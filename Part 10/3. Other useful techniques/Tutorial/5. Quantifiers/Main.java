import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        String string = "trololololo";

        //The quantifier * repeats 0 or more times
        if (string.matches("trolo(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "trololo";

        //The quantifier + repeats 1 or more times
        if (string.matches("trolo(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "nananananananana Batmaan!";

        if (string.matches("(na)+ Batmaan!")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "You have to accidentally delete the whole meme";

        //The quantifier ? repeats 0 or 1 times
        if (string.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "1010";

        //The quantifier {a} repeats a times
        if (string.matches("(10){2}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "1";
        
        //The quantifier {a,b} repeats a ... b times
        if (string.matches("1{2,4}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }
}