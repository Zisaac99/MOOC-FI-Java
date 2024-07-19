import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        // // Using count
        // List<Integer> values = new ArrayList<>();
        // values.add(3);
        // values.add(2);
        // values.add(17);
        // values.add(6);
        // values.add(8);

        // System.out.println("Values: " + values.stream().count());


        // // Using forEach
        // values.stream()
        // .filter(value -> value % 2 == 0)
        // .forEach(value -> System.out.println(value));


        // // Using collect
        // List<Integer> values = new ArrayList<>();
        // values.add(3);
        // values.add(2);
        // values.add(-17);
        // values.add(-6);
        // values.add(8);

        // ArrayList<Integer> positives = values.stream()
        //     .filter(value -> value > 0)
        //     .collect(Collectors.toCollection(ArrayList::new));

        // positives.stream()
        //     .forEach(value -> System.out.println(value));


        // // Using reduce
        // ArrayList<Integer> values = new ArrayList<>();
        // values.add(7);
        // values.add(3);
        // values.add(2);
        // values.add(1);

        // int sum = values.stream()
        // .reduce(0, (previousSum, value) -> previousSum + value);
        // System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream()
            .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(combined);
    } 
}