import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        UserInterface UI = new UserInterface(new Container(), new Container(), scanner);
        UI.start();
    }
}