import java.util.*;

public class DictionaryOfManyTranslations{
    private HashMap<String,ArrayList<String>> hm;

    public DictionaryOfManyTranslations(){
        this.hm = new HashMap<String,ArrayList<String>>();
    }

    public void add(String word, String translation){
        this.hm.putIfAbsent(word,new ArrayList<String>());

        this.hm.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        this.hm.putIfAbsent(word,new ArrayList<String>());

        return this.hm.get(word);
    }

    public void remove(String word){
        this.hm.remove(word);
    }
}