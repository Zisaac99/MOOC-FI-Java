import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        ArrayList<String> lines =  new ArrayList<>();

        // create a Scanner object for reading files
        try (Scanner reader = new Scanner(new File("file.txt"))) {

            // read all lines from a file
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}