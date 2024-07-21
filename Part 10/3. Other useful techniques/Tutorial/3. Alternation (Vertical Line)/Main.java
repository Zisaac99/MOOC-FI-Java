import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        String string = "00";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }
    }
}