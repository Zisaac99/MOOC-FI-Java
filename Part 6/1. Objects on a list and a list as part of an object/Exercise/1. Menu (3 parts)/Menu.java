import java.util.*;

public class Menu {

    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        this.meals.add(meal);
    }

    public void printMeals(){
        for(String m: this.meals){
            System.out.println(m);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}