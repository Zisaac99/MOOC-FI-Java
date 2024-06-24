import java.util.*;

public class GradeRegister{
    private ArrayList<Integer> points;
    private ArrayList<Integer> passed;
    private ArrayList<Integer> grades;

    public GradeRegister(){
        this.points = new ArrayList<Integer>();
        this.passed = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public void addPoints(int num){
        this.points.add(num);
    }

    public void addPassed(int num){
        int passing = 50;

        if(num >= passing){
            this.passed.add(num);
        }
    }

    public void addGrades(int num){
        int grade = 0;

        if(num >= 50 && num <= 59){
            grade = 1;
        }else if(num >= 60 && num <= 69){
            grade = 2;
        }else if(num >= 70 && num <= 79){
            grade = 2;
        }else if(num >= 80 && num <= 89){
            grade = 2;
        }else if(num >= 90){
            grade = 5;
        }

        this.grades.add(grade);
    }

    public double calculatePointAvg(){
        int sum = 0;
        
        for(int num: this.points){
            sum += num;
        }

        return (1.0 * sum) / this.points.size();
    }

    public double calculateAvgPassing(){
        int sum = 0;
        
        for(int num: this.passed){
            sum += num;
        }

        return (1.0 * sum) / this.passed.size();
    }

    public double calculatePassPercentage(){
        return (1.0 * this.passed.size() / this.points.size()) * 100;
    }

    public void printGradeDistribution(){
        int num = 0;
        for(int i = 5; i >= 0; i--){
            for(int grade: this.grades){
                if(grade == i){
                    num += 1;
                }
            }
            System.out.println("" + i + ":" + createStars(num));
            num = 0;
        }
    }

    public String createStars(int num){
        String stars = "";
        for(int i = 0; i < num; i++){
            stars += "*";
        }

        return stars;
    }
}