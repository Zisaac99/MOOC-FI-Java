import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("pencil",1));
        suitcase.addItem(new Item("table",4));
        suitcase.addItem(new Item("ipad",5));
        suitcase.addItem(new Item("phone",1));

        Suitcase suitcase2 = new Suitcase(9);
        suitcase2.addItem(new Item("table",4));
        suitcase2.addItem(new Item("ipad",5));
        suitcase2.addItem(new Item("phone",1));

        Suitcase suitcase3 = new Suitcase(9);
        suitcase3.addItem(new Item("pencil",1));
        suitcase3.addItem(new Item("table",3));
        suitcase3.addItem(new Item("ipad",5));
        suitcase3.addItem(new Item("phone",1));

        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        System.out.println(suitcase.heaviestItem());

        System.out.println();
        Hold hold = new Hold(21);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        hold.addSuitcase(suitcase3);
        System.out.println(hold.totalWeight());
        hold.printItems();
        System.out.println(hold.heaviestItem());
    }
}