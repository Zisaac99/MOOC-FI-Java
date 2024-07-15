import java.util.*;

public class ShoppingCart{
    private Map<String, Item> items;

    public ShoppingCart(){
        this.items = new HashMap<String, Item>();
    }

    public void add(String product, int price){
        if(items.containsKey(product)){
            Item item = items.get(product);
            item.increaseQuantity();
            // items.put(product, item);
        }else{
            items.put(product, new Item(product,1,price));
        }
    }

    public int price(){
        int price = 0;
        for(Item i: this.items.values()){
            price += i.price();
        }

        return price;
    }

    public void print(){
        for(Item i: this.items.values()){
            System.out.println(i);
        }
    }
}