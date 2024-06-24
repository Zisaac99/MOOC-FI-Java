import java.util.*;

public class Recipe{
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int times, ArrayList<String> ingredientss){
        this.name = name;
        this.time = times;
        this.ingredients = ingredientss;
    }

    public String getName(){
        return this.name;
    }

    public int getTime(){
        return this.time;
    }

    public boolean containIng(String ing){
        for(String s: this.ingredients){
            if(s.equals(ing)){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.time;
    }

}