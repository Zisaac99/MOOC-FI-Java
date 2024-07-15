import java.util.*;

public class Warehouse{
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product){
        return this.prices.getOrDefault(product,-99);
    }

    public int stock(String product){
        return this.stocks.getOrDefault(product,0);
    }

    public boolean take(String product){
        if(!this.stocks.containsKey(product)){
            return false;
        }

        if(this.stocks.get(product) > 0){
            this.stocks.put(product, this.stocks.get(product) - 1);
            // this.stocks.replace(product, this.stocks.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products(){
        return this.stocks.keySet();
    }
}