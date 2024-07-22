import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        try {
            // program code which might throw an exception
        } catch (Exception e) {
            // details of the exception are stored in the variable e

            // read stack trace from bottom up
            e.printStackTrace();
        }
    }
}