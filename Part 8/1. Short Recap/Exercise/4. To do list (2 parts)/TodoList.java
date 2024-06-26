import java.util.*;

public class TodoList{
    private List<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<String>();
    }

    public void add(String task){
        this.tasks.add(task);
    }

    public void print(){
        for(int i = 0; i < this.tasks.size(); i++){
            System.out.println("" + (i+1) + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number){
        this.tasks.remove(number);
    }
}