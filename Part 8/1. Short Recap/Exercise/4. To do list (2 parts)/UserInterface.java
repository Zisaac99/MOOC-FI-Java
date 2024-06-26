import java.util.*;

public class UserInterface{
    private TodoList tdl;
    private Scanner scanner;

    public UserInterface(TodoList tdl, Scanner scanner){
        this.tdl = tdl;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command:");
            String command = this.scanner.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.print("To add:");
                String task = this.scanner.nextLine();

                this.tdl.add(task);
            }

            if(command.equals("list")){
                this.tdl.print();
            }

            if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int num = Integer.valueOf(this.scanner.nextLine());

                this.tdl.remove(num - 1);
            }
        }
    }
}