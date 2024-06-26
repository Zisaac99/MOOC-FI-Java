import java.util.*;

public class Container{
    private int curr;
    private int capacity;

    public Container(){
        this.curr = 0;
        this.capacity = 100;
    }

    public int contains(){
        return this.curr;
    }

    public void add(int amount){
        if(amount <= 0){
            return;
        }

        this.curr += amount;

        if(this.curr > this.capacity){
            this.curr = this.capacity;
        }
    }

    public void remove(int amount){
        if(amount <= 0){
            return;
        }
        
        this.curr -= amount;

        if(this.curr < 0){
            this.curr = 0;
        }
    }

    // public void move(Container ctn, int amount){
    //     if(this.curr < amount){
    //         amount = this.curr;
    //     }

    //     remove(amount);
    //     ctn.add(amount);
    // }

    @Override
    public String toString(){
        return "" + this.curr + "/" + this.capacity;
    }
}