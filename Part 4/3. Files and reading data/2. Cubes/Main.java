import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while(true){
            String str = input.nextLine();

            if(str.equals("end")){
                break;
            }

            System.out.println(Math.round(Math.pow(Integer.valueOf(str),3)));
        }
    }
}