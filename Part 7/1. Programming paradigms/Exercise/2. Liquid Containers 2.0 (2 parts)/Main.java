import java.util.*;

public class Main{
    public static void main(String[] args){
        Container first = new Container();
        Container second = new Container();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }
            System.out.println("");

            String[] commands = input.split(" ");
            String command = commands[0];
            int amount = Integer.valueOf(commands[1]);

            if(command.equals("add")){
                first.add(amount);
                continue;
            }

            if(command.equals("move")){
                first.move(second,amount);
                continue;
            }

            if(command.equals("remove")){
                second.remove(amount);
                continue;
            }
        }
    }
}