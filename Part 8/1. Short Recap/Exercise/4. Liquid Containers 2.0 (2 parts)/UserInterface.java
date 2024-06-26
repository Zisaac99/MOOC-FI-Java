import java.util.*;

public class UserInterface{
    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Container first, Container second, Scanner scanner){
        this.first = first;
        this.second = second;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
            String input = this.scanner.nextLine();

            if(input.equals("quit")){
                break;
            }
            System.out.println("");
            
            String[] commands = input.split(" ");
            String command = commands[0];
            int amount = Integer.valueOf(commands[1]);

            if(command.equals("add")){
                this.first.add(amount);
            }

            if(command.equals("remove")){
                this.second.remove(amount);
            }

            if(command.equals("move")){
                int firstCurrAmt = this.first.contains();
                if(firstCurrAmt < amount){
                    amount = firstCurrAmt;
                }

                this.first.remove(amount);
                this.second.add(amount);
            }
        }
    }
}