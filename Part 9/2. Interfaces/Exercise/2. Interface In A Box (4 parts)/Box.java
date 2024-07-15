import java.util.*;

public class Box implements Packable{
    private double capacity;
    private List<Packable> list;

    public Box(double capacity){
        this.capacity = capacity;
        this.list = new ArrayList<Packable>();
    }

    public double weight(){
        double weight = 0;
        for(Packable p: this.list){
            weight += p.weight();
        }

        return weight;
    }

    public void add(Packable packable){
        if(weight() + packable.weight() <= capacity){
            list.add(packable);
        }
    }

    @Override
    public String toString(){
        return "Box: " +  this.list.size() + " items, total weight " + weight() + " kg";
    }
}