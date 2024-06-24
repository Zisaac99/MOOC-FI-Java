import java.util.*;
import java.nio.file.Paths;

public class UserInterface{
    private Database db;
    private Scanner input;

    public UserInterface(Database db, Scanner input){
        this.db = db;
        this.input = input;
    }

    public void start(){
        while(true){
            System.out.print("?");
            String command = this.input.nextLine();

            if(command.equals("Quit")){
                break;
            }

            if(command.equals("Add")){
                System.out.print("Name:");
                String name = this.input.nextLine();

                System.out.print("Name in Latin:");
                String latinName = this.input.nextLine();
                this.db.addBird(name,latinName);
                continue;
            }

            if(command.equals("Observation")){
                System.out.print("Bird?");
                String name = this.input.nextLine();

                if(! this.db.addObservation(name)){
                    System.out.println("Not a bird!");
                }

                continue;
            }

            if(command.equals("All")){
                this.db.printAllBirds();
                continue;
            } 

            if(command.equals("One")){
                System.out.print("Bird?");
                String name = this.input.nextLine();

                if(! this.db.printOneBird(name)){
                    System.out.println("Bird does not exists!");
                }

                continue;
            } 

            System.out.println("Unknown command!");
        }
    }

}