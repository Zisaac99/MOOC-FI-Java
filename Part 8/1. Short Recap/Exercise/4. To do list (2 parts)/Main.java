import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        UserInterface UI = new UserInterface(list,scanner);
        UI.start();
    }
}