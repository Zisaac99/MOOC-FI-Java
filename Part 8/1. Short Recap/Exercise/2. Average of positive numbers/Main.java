import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(true){
            int num = Integer.valueOf(input.nextLine());

            if(num == 0){
                break;
            }

            if(num > 0){
                counter++;
                sum += num;
            }
        }

        if(counter == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(1.0 * sum / counter);
        }
    }
}