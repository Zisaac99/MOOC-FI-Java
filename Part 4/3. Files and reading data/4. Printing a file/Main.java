import java.util.*;
import java.nio.file.Paths;

public class Main{
    public static void main(String[] args){
        try{
            Scanner file = new Scanner(Paths.get("data.txt"));

            while(file.hasNextLine()){
                String text = file.nextLine();
                System.out.println(text);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}