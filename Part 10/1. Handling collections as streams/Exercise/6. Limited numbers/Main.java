import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<Integer>();

        while(true){
            int input = Integer.valueOf(scanner.nextLine());

            if(input < 0){
                break;
            }

            inputs.add(input);
        }

        inputs.stream()
        .filter(value -> value >= 1 && value <= 5)
        .forEach(value -> System.out.println(value));
    }
}