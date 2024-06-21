import java.util.*;

public class UserInterface{
    private GradeRegister grades;
    private Scanner scanner;

    public UserInterface(GradeRegister grades, Scanner scanner){
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start(){
        readPoints();
        System.out.println("");
        printGradeDistribution();Joke Manager
        printAvgPoints();
        printAvgGrades();
    }

    public void readPoints(){
        while(true){
            System.out.print("Points: ");
            String input = this.scanner.nextLine();

            if(input.equals("")){
                break;
            }

            int points = Integer.valueOf(input);

            if(points < 0 || points > 100){
                System.out.println("Impossible number.");
                continue;
            }

            this.grades.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution(){
        for(int i = 5; i >= 0; i--){
            System.out.println("" + i + ":" + createStars(i));
        }
    }

    public String createStars(int num){
        String stars = "";
        for(int i = 0; i < this.grades.numberOfGrades(num); i++){
            stars += "*";
        }
        return stars;
    }

    public void printAvgPoints(){
        System.out.println("The average of points: " + this.grades.averageOfPoints());
    }

    public void printAvgGrades(){
        System.out.println("The average of grades: " + this.grades.averageOfGrades());
    }
}