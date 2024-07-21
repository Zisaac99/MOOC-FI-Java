import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }
    }
}