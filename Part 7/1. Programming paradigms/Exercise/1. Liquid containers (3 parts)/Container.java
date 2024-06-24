import java.util.*;

public class Container{
    private int value;
    private int limit;
    private String name;

    public Container(String name, int value, int limit){
        this.name = name;
        this.value = value;
        this.limit = limit;
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
        remove(amount);
        container.add(amount);
    }

    @Override
    public String toString(){
        return name + ": " + this.value + "/" + this.limit;
    }
}