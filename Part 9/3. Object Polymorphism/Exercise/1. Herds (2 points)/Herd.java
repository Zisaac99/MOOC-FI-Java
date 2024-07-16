import java.util.*;

public class Herd implements Movable{
    private List<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<Movable>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable m: this.herd){
            m.move(dx,dy);
        }
    }

    @Override
    public String toString(){
        String str = "";
        int size = this.herd.size();
        for(int i = 0; i < size; i++){
            if(i < size - 1){
                str += this.herd.get(i).toString() + "\n";
            }else{
                str += this.herd.get(i).toString();
            }
        }

        return str;
    }
}