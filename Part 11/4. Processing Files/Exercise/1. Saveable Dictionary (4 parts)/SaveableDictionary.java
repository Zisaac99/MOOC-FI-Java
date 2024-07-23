import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;

public class SaveableDictionary{
    private Map<String, String> dict;
    private Set<String> set;
    private File file;

    public SaveableDictionary(String file){
        this.dict = new HashMap<String, String>();
        this.file = new File(file);
    }

    public void add(String words, String translation){
        this.dict.put(words,translation);
        this.dict.put(translation,words);
    }

    public String translate(String word){
        return this.dict.getOrDefault(word,null);
    }

    public void delete(String word){
        if(this.dict.containsKey(word)){
            String translation = this.dict.get(word);
            this.dict.remove(word);
            this.dict.remove(translation);
        }
    }

    public boolean load(){
        try{
            Scanner file = new Scanner(this.file);

            while(file.hasNextLine()){
                String row = file.nextLine();

                if(row.isEmpty()){
                    continue;
                }

                String[] parts = row.split(":");
                this.dict.put(parts[0],parts[1]);
                this.dict.put(parts[1],parts[0]);
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean save(){
        try{
            this.set = new HashSet<String>();
            PrintWriter pw = new PrintWriter(this.file);

            for(String s: this.dict.keySet()){
                String translation = this.dict.get(s);
                if(!(this.set.contains(s) && this.set.contains(translation))){
                    pw.println(s + ":" + translation);
                    this.set.add(s);
                    this.set.add(translation);
                }
            }

            pw.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
}