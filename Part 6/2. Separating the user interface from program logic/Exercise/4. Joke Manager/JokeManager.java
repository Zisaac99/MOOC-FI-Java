import java.util.*;

public class JokeManager{
    private ArrayList<String> list;

    public JokeManager(){
        this.list = new ArrayList<String>();
    }

    public void addJoke(String joke){
        this.list.add(joke);
    }

    public String drawJokes(){
        if(this.list.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random draw = new Random();
        int index = draw.nextInt(this.list.size());
        return list.get(index);
    }

    public void printJokes(){
        for(String s: this.list){
            System.out.println(s);
        }
    }
}
