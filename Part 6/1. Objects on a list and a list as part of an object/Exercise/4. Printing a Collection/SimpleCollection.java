import java.util.*;

public class SimpleCollection{
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString(){
        if(this.elements.size() == 0){
            return "The collection alphabet is empty.";
        }

        String elementMessage = "";

        for(String e: this.elements){
            elementMessage += e + "\n";
        }

        return "The collection alphabet has " + this.elements.size() + " element:\n" + elementMessage;
    }
}