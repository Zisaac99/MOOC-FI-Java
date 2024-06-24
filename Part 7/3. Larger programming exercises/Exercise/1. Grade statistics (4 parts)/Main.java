import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GradeRegister grades = new GradeRegister();

        UserInterface UI = new UserInterface(grades,input);
        UI.start();
    }
}