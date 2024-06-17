import java.util.*;

public class Package{
    private ArrayList<Gift> gifts;

    public Package(){
        this.gifts = new ArrayList<Gift>();
    }

    public void addGift(Gift gift){
        this.gifts.add(gift);
    }

    public int totalWeight(){
        int sum = 0;

        for(Gift g:gifts){
            sum += g.getWeight();
        }

        return sum;
    }
}