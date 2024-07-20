import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        List<Human> humans = new ArrayList<Human>();
        humans.add(new Human("John",10));
        humans.add(new Human("Mary",30));
        humans.add(new Human("Ann",20));
        humans.add(new Human("Sue",100));

        humans.stream().sorted().forEach(val -> System.out.println(val));
    }
}