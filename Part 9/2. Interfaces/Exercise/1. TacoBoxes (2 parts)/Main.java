import java.util.*;

public class Main{
    public static void main(String[] args){
        TripleTacoBox ttb = new TripleTacoBox();
        CustomTacoBox ctb = new CustomTacoBox(4);

        System.out.println(ttb.tacosRemaining());
        ttb.eat();
        ttb.eat();
        ttb.eat();
        System.out.println(ttb.tacosRemaining());
        ttb.eat();
        System.out.println(ttb.tacosRemaining());
        
        System.out.println("");

        System.out.println(ctb.tacosRemaining());
        ctb.eat();
        ctb.eat();
        ctb.eat();
        ctb.eat();
        System.out.println(ctb.tacosRemaining());
        ctb.eat();
        System.out.println(ctb.tacosRemaining());
    }
}