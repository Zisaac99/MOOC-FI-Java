import java.util.*;

public class UserInterface{
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String command = this.scanner.nextLine();

            if(command.equals("X")){
                break;
            }

            if(command.equals("1")){
                addJokeUI();
                continue;
            }

            if(command.equals("2")){
                drawJokeUI();
                continue;
            }

            if(command.equals("3")){
                listJokeUI();
                continue;
            }

            System.out.println("Unknown Command!");
        }
    }

    public void addJokeUI(){
        System.out.println("Write the joke to be added: ");
        String joke = this.scanner.nextLine();
        this.jokes.addJoke(joke);
    }

    public void drawJokeUI(){
        System.out.println("Write the joke to be added: ");
        System.out.println(this.jokes.drawJokes());
    }

    public void listJokeUI(){
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }
}