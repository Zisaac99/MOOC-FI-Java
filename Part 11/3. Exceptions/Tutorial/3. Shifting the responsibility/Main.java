import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        //System.out.println(readLines("test.txt"));
        readLines2("test2.txt");
    }

    public static List<String> readLines(String fileName){
        List<String> lines =  new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName)).filter(r -> !r.isEmpty()).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lines;
    }

    public static List<String> readLines2(String fileName) throws Exception {
        ArrayList<String> lines =  new ArrayList<>();
        Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        return lines;
    }
}