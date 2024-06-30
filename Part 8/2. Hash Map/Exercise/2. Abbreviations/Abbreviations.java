import java.util.*;

public class Abbreviations{
    private HashMap<String, String> abbrev;

    public Abbreviations(){
        this.abbrev = new HashMap<String, String>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.abbrev.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return this.abbrev.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return this.abbrev.get(abbreviation);
    }
}
