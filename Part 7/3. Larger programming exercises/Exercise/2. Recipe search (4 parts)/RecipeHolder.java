import java.util.*;

public class RecipeHolder{
    private ArrayList<Recipe> recipes;

    public RecipeHolder(){
        this.recipes = new ArrayList<Recipe>();
    }

    public void addRecipe(String name, int time, ArrayList<String> ingredients){
        this.recipes.add(new Recipe(name,time,ingredients));
    }

    public void listRecipes(){
       for(Recipe r: this.recipes){
            System.out.println(r);
        } 
    }

    public void printContainName(String name){
        for(Recipe r: this.recipes){
            if(r.getName().contains(name)){
                System.out.println(r);
            }
        }
    }

    public void printContainTime(int time){
        for(Recipe r: this.recipes){
            if(r.getTime() <= time){
                System.out.println(r);
            }
        }
    }
    
    public void printContainIngredients(String ingredient){
        for(Recipe r: this.recipes){
            if(r.containIng(ingredient)){
                System.out.println(r);
            }
        }
    }
}