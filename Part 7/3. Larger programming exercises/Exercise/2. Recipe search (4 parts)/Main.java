import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RecipeHolder recipes = new RecipeHolder();

        UserInterface UI = new UserInterface(recipes,input);
        UI.start();
    }
}