import java.util.*;

public class Main{
    public static void main(String[] args){
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface UI = new UserInterface(manager,scanner);
        UI.start();
    }
}