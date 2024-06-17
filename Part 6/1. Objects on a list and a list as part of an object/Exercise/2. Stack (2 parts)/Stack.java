import java.util.*;

public class Stack{
    private ArrayList<String> stack;

    public Stack(){
        this.stack = new ArrayList<String>();
    }

    public boolean isEmpty(){
        if(this.stack.size() == 0){
            return true;
        }

        return false;
    }

    public void add(String value){
        this.stack.add(value);
    }

    public ArrayList<String> values(){
        return this.stack;
    }

    public String take(){
        ArrayList<String> list = this.stack;
        int last = list.size() - 1;
        String value = list.get(last);
        list.remove(last);
        return value;

    }
}