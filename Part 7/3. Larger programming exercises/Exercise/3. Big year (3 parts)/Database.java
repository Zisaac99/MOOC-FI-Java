import java.util.*;

public class Database{
    private ArrayList<Bird> birds;

    public Database(){
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName){
        this.birds.add(new Bird(name,latinName));
    }

    public boolean addObservation(String name){
        for(Bird b: this.birds){
            if(b.getName().equals(name) || b.getLatinName().equals(name)){
                b.increaseObservation();
                return true;
            }
        }

        return false;
    }

    public void printAllBirds(){
        for(Bird b: this.birds){
            System.out.println(b);
        }
    }

    public boolean printOneBird(String name){
        for(Bird b: this.birds){
            if(b.getName().equals(name) || b.getLatinName().equals(name)){
                System.out.println(b);
                return true;
            }
        }

        return false;
    }
}