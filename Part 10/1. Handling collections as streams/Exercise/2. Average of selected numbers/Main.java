import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>();

        System.out.println("Input numbers, type end to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String posOrNeg = scanner.nextLine();
        
        double avg = 0.0;
        if(posOrNeg.equals("n")){
            avg = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble();
            System.out.println("average of the negative numbers: " + avg);
        }else{
            avg = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s >= 0).average().getAsDouble();
            System.out.println("average of the positive numbers: " + avg);
        }

    }
}