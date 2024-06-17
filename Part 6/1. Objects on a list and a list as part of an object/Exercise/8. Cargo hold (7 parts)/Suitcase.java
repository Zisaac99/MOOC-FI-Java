import java.util.*;

public class Suitcase{
    private ArrayList<Item> iList;
    private int maxWeight;
    private int currWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.currWeight = 0;
        this.iList = new ArrayList<Item>();
    }

    public void addItem(Item item){
        if(this.currWeight + item.getWeight() < this.maxWeight){
            this.iList.add(item);
            this.currWeight += item.getWeight();
        }
    }

    public void printItems(){
        for(Item i: iList){
            System.out.println(i);
        }
    }

    public int totalWeight(){
        return currWeight;
    }

    public Item heaviestItem(){
        ArrayList<Item> list = this.iList;

        if(list.isEmpty()){
            return null;
        } 

        Item heaviest = list.get(0);
        for(Item i: list){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }

        return heaviest;
    }

    @Override
    public String toString(){
        String items = "";
        int listSize = this.iList.size();
        if(listSize == 0){
            items = "no items";
        }else if(listSize == 1){
            items = "1 item";
        }else{
            items = String.valueOf(listSize) + " items";
        }
        return items + " (" + this.currWeight + " kg)";
    }
}