import java.util.*;

public class Hold{
    private ArrayList<Suitcase> sList;
    private int maxWeight;
    private int currWeight;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.sList = new ArrayList<Suitcase>();
        this.currWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.currWeight < this.maxWeight){
            this.sList.add(suitcase);
            this.currWeight += suitcase.totalWeight();
        }
    }

    public void printItems(){
        for(Suitcase s: this.sList){
            s.printItems();
        }
    }

    @Override
    public String toString(){
        String items = "";
        int listSize = this.sList.size();
        if(listSize == 0){
            items = "no suitcases";
        }else if(listSize == 1){
            items = "1 suitcase";
        }else{
            items = String.valueOf(listSize) + " suitcase";
        }
        return items + " (" + this.currWeight + " kg)";
    }
}