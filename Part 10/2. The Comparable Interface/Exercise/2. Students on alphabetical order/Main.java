import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ada"));
        students.add(new Student("AdaLove"));
        students.add(new Student("Ada"));
        students.add(new Student("AdaLoveLace"));

        students.stream().sorted().forEach(s -> System.out.println(s));
    }
}