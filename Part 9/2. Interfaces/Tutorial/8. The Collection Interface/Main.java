import java.util.*;

public class Main{
    public static void main(String[] args){
        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        List<String> phrases = new ArrayList<String>();
        phrases.add("test 123");
        phrases.add("testing 123");

        System.out.println("Keys:");
        for (String key: keyCollection) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> values = translations.values();

        for (String value: values) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> words = phrases;

        for(String word: words){
            System.out.println(word);
        }
    }
}