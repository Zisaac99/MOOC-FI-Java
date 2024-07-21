import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        String string = "00000";

        if (string.matches("0000(0|1)")) {
            System.out.println("The string contained one of the two alternatives");
        } else {
            System.out.println("The string contained none of the two alternatives");
        }

        String string2 = "car";

        if (string2.matches("car(s|)")) {
            System.out.println("The string contained one of the two alternatives");
        } else {
            System.out.println("The string contained none of the two alternatives");
        }
    }
}