import java.util.*;

public class Main{
    public static void main(String[] args){
        GradeRegister grades = new GradeRegister();
        Scanner scanner = new Scanner(System.in);

        UserInterface UI = new UserInterface(grades,scanner);
        UI.start();
    }
}