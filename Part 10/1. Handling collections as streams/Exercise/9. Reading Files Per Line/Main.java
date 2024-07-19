import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        System.out.println(read(scanner.nextLine()));
    }

    public static List<String> read(String file){
        List<String> content = new ArrayList<String>();
        try{
            Files.lines(Paths.get(file)).forEach(r -> content.add(r));
        }catch(Exception e){
            System.out.println(e);
        }
        return content;
    }
}