import java.util.*;

public class IOU{
    private HashMap<String, Double> hm;

    public IOU(){
        this.hm = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount){
        this.hm.put(toWhom,amount);
        // if(!this.hm.containsKey(toWhom)){
        //     this.hm.put(toWhom,amount);
        // }else{
        //     this.hm.put(toWhom, this.hm.get(toWhom) + amount);
        // }
    }

    public double howMuchDoIOweTo(String toWhom){
        return this.hm.getOrDefault(toWhom,0.0);
    }
}