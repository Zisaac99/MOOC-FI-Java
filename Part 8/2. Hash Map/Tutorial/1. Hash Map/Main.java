import java.util.*;

public class Main{
    public static void main(String[] args){
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");

        String translation = numbers.get("One");
        System.out.println(translation);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Uno"));
    }
}