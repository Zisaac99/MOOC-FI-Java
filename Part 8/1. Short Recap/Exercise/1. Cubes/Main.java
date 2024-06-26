import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            String num = input.nextLine();

            if(num.equals("end")){
                break;
            }

            int number = Integer.valueOf(num);

            System.out.println(number * number * number);
        }
    }
}