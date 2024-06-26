import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");

        while(true){
            System.out.println(first);
            System.out.println(second);
            String input = scanner.nextLine();
            System.out.println("");

            if(input.equals("quit")){
                break;
            }

            String[] commands = input.split(" ");
            String command = commands[0];
            int amount = Integer.valueOf(commands[1]);
            
            if(command.equals("add")){
                first.add(amount);
            }

            if(command.equals("move")){
                first.move(second,amount);
            }

            if(command.equals("remove")){
                second.remove(amount);
            }
        }
    }
}