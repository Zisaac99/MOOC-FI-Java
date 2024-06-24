import java.util.*;
import java.nio.file.Paths;

public class UserInterface{
    private RecipeHolder recipes;
    private Scanner input;

    public UserInterface(RecipeHolder recipes, Scanner input){
        this.recipes = recipes;
        this.input = input;
    }

    public void start(){
        readFile();
        executeCommands();
    }

    public void readFile(){
        while(true){
            System.out.println("File to read: ");
            String fileName = this.input.nextLine();

            try{
                Scanner scanner = new Scanner(Paths.get(fileName));
                while(scanner.hasNextLine()){
                    String name = "";
                    int time = 0;
                    ArrayList<String> ingredients = new ArrayList<String>();

                    name = scanner.nextLine();
                    time = Integer.valueOf(scanner.nextLine());

                    while(true){
                        String line = scanner.nextLine();

                        if(line.isEmpty() || ! scanner.hasNextLine()){
                            this.recipes.addRecipe(name,time,ingredients);
                            break;
                        }

                        ingredients.add(line);
                    }
                }
            }catch(Exception e){
                System.out.println(e);
                System.out.println("");
                continue;
            }
            break;
        }
    }

    public void executeCommands(){
        System.out.println("");
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
        System.out.println("");

        while(true){
            System.out.println("Enter command: ");
            String command = this.input.nextLine();
            
            if(command.equals("stop")){
                break;
            }

            System.out.println("");

            if(command.equals("list")){
                System.out.println("Recipes:");
                this.recipes.listRecipes();
                System.out.println("");
                continue;
            }

            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String word = this.input.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.printContainName(word);
                System.out.println("");
                continue;
            }

            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(this.input.nextLine());

                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.printContainTime(time);
                System.out.println("");
                continue;
            }

            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ing = this.input.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.printContainIngredients(ing);
                System.out.println("");
                continue;
            }
        }
    }
}