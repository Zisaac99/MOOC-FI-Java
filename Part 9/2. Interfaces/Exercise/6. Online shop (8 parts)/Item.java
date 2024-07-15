import java.util.*;

public class Item{
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty += 1;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || (this.getClass() != obj.getClass())){
            return false;
        }

        Item objItem = (Item) obj;
        return Objects.equals(this.product, objItem.product);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.product);
    }
}