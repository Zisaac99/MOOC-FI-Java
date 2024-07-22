import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        // throw new NumberFormatException(); // Program throws an exception
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
    }
}