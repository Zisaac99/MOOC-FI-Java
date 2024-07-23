import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // // PART 1
        // SaveableDictionary dictionary = new SaveableDictionary();
        // dictionary.add("apina", "monkey");
        // dictionary.add("banaani", "banana");
        // dictionary.add("apina", "apfe");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("monkey"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // System.out.println(dictionary.translate("banana"));


        // // PART 2
        // SaveableDictionary dictionary = new SaveableDictionary();
        // dictionary.add("apina", "monkey");
        // dictionary.add("banaani", "banana");
        // dictionary.add("ohjelmointi", "programming");
        // dictionary.delete("apina");
        // dictionary.delete("banana");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("monkey"));
        // System.out.println(dictionary.translate("banana"));
        // System.out.println(dictionary.translate("banaani"));
        // System.out.println(dictionary.translate("ohjelmointi"));


        // // PART 3
        // SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        // boolean wasSuccessful = dictionary.load();

        // if (wasSuccessful) {
        //     System.out.println("Successfully loaded the dictionary from file");
        // }

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // System.out.println(dictionary.translate("alla oleva"));


        // // PART 4
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
        dictionary.add("ohjelmointi", "programming");
        // use the dictionary

        dictionary.save();
    }
}