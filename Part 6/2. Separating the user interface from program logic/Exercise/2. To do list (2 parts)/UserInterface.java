import java.util.*;

public class UserInterface{
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.print("To add: ");
                String sentence = this.scanner.nextLine();
                this.list.add(sentence);
                continue;
            }

            if(command.equals("list")){
                this.list.print();
                continue;
            }

            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(num - 1);
                continue;
            }

            System.out.println("Unknown command!");
        }
    }
}