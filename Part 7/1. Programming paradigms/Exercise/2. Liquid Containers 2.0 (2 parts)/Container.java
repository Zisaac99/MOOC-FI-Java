import java.util.*;

public class Container{
    private int value;
    private int limit;

    public Container(){
        this.value = 0;
        this.limit = 100;
    }

    public void add(int amount){
        if(amount < 0){
            return;
        }

        if(this.value + amount > this.limit){
            this.value = this.limit;
        }else{
            this.value += amount;
        }
    }

    public int contains(){
        return this.value;
    }

    public void remove(int amount){
        if(amount < 0){
            return;
        }
        
        if(this.value - amount < 0){
            this.value = 0;
        }else{
            this.value -= amount;
        }
    }

    public void move(Container container, int amount){
        if(this.value < amount){
            amount = this.value;
        }
        remove(amount);
        container.add(amount);
    }

    @Override
    public String toString(){
        return "" + this.value + "/" + this.limit;
    }
}