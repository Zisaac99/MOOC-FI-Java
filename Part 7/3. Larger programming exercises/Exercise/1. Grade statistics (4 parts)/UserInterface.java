import java.util.*;

public class UserInterface{
    private GradeRegister grades;
    private Scanner input;

    public UserInterface(GradeRegister grades, Scanner input){
        this.grades = grades;
        this.input = input;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int num = Integer.valueOf(this.input.nextLine());

            if(num == -1){
                break;
            }

            if(num >= 0 && num <= 100){
                this.grades.addPoints(num);
                this.grades.addPassed(num);
                this.grades.addGrades(num);
            }
        }
        System.out.println("Point average (all): " + this.grades.calculatePointAvg());
        System.out.println("Point average (passing): " + this.grades.calculateAvgPassing());
        System.out.println("Pass percentage: " + this.grades.calculatePassPercentage());
        System.out.println("Grade distribution:");
        this.grades.printGradeDistribution();
    }
}