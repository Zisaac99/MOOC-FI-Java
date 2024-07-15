import java.util.*;

public class Main{
    public static void main(String[] args){
        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }
    }
}