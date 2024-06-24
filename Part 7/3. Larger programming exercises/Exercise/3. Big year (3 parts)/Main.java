import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Database db = new Database();

        UserInterface UI = new UserInterface(db,input);
        UI.start();
    }
}