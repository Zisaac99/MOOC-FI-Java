import java.util.*;

public class Main{
    public static void main(String[] args){
        Packer packer = new Packer();

        Box box = packer.giveABoxOfThings();
        System.out.println(box);
    }
}