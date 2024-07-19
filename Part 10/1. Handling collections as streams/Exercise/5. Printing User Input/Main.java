import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>();

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            inputs.add(input);
        }

        inputs.stream().forEach(value -> System.out.println(value));
    }
}