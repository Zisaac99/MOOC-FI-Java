import java.util.*;

public class Bird{
    private String name;
    private String latinName;
    private int numOfObservations;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.numOfObservations = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public void increaseObservation(){
        this.numOfObservations += 1;
    }

    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.numOfObservations + " observations";
    }
}