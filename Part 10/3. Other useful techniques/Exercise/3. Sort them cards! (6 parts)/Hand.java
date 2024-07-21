import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.lang.*;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand(){
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        this.hand.stream().forEach(c -> System.out.println(c));
    }

    public void sort(){
        this.hand = this.hand.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public int compareTo(Hand cHand){
        int sum = 0;
        int sum2 = 0;

        for(Card c: this.hand){
            sum += c.getValue();
        }

        for(Card c: cHand.hand){
            sum2 += c.getValue();
        }

        return sum - sum2;
    }

    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}