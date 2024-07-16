import java.util.*;

public class Main{
    public static void main(String[] args){
        // // PART 2
        // Dog dog = new Dog();
        // dog.bark();
        // dog.eat();

        // Dog fido = new Dog("Fido");
        // fido.bark();


        // // PART 3
        // Cat cat = new Cat();
        // cat.purr();
        // cat.eat();

        // Cat garfield = new Cat("Garfield");
        // garfield.purr();


        // PART 4
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

        Animal muscles = new Cat("Muscles");
        muscles.sleep();
        muscles.eat();

        Cat m = (Cat) muscles;
        m.eat();
        m.makeNoise();
    }   
}