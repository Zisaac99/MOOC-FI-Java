import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        try{
            Files.lines(Paths.get("literacy.csv"))
            .map(r -> r.split(","))
            .filter(r -> r.length == 6)
            .sorted((first,second) -> {return Double.valueOf(first[5]).compareTo(Double.valueOf(second[5]));})
            .forEach(r -> System.out.println(r[3].trim() + " (" + r[4].trim() + "), " + r[2].trim().split(" ")[0] +", " + r[5].trim()));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
