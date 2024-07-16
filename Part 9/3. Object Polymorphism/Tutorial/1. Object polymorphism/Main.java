import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        // String text = "text";
        // Object textString = "another string";

        // String text = "text";
        // Object textString = text;

        // Object textString = "another string";
        //String text = textString; // WON'T WORK! Since Object is not of type String


        // Printer printer = new Printer();

        // String string = " o ";
        // List<String> words = new ArrayList<>();
        // words.add("polymorphism");
        // words.add("inheritance");
        // words.add("encapsulation");
        // words.add("abstraction");

        // printer.printManyTimes(string, 2);
        // printer.printManyTimes(words, 3);


        Serializable serializableString = "string";
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";

        Printer printer = new Printer();

        String string = "works";

        printer.printCharacters(string);
    }
}