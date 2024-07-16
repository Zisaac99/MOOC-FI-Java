import java.util.*;

public class Dog extends Animal implements NoiseCapable{
    private String name;

    public Dog(){
        super("Dog");
    }

    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.println(super.getName() + " barks");
    }

    public void makeNoise(){
        bark();
    }
}