import java.util.*;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory(){
        this.list = new ArrayList<Double>();
    }

    public void add(double status){
        this.list.add(status);
    }

    public void clear(){
        this.list.clear();
    }

    public double maxValue(){
        double max = this.list.get(0);

        for(Double d: this.list){
            if(d > max){
                max = d;
            }
        }

        return max;
    }

    public double minValue(){
        double min = this.list.get(0);

        for(Double d: this.list){
            if(d < min){
                min = d;
            }
        }

        return min;
    }

    public double average(){
        double sum = 0.0;
        
        if(this.list.size() == 0){
            return sum;
        }

        for(Double d: this.list){
            sum += d;
        }

        return sum / this.list.size();
    }

    @Override
    public String toString(){
        return this.list.toString();
    }
}