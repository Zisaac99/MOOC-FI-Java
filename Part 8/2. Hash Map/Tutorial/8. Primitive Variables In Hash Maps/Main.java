import java.util.*;

public class Main{
    public static void main(String[] args){
        int key = 2;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(key, 10);
        int value = hashmap.get(key);
        System.out.println(value);
    }
}