import java.util.*;

public class Main{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element: set) {
            System.out.println(element);
        }
    }
}