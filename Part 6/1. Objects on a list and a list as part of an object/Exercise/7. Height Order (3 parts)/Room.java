import java.util.*;

public class Room{
    private ArrayList<Person> list;

    public Room(){
        this.list = new ArrayList<Person>();
    }

    public void add(Person person){
        this.list.add(person);
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.list;
    }

    public Person shortest(){
        ArrayList<Person> plist = this.list;

        if(plist.isEmpty()){
            return null;
        }

        Person shortest = plist.get(0);

        for(Person p: plist){
            if(p.getHeight() < shortest.getHeight()){
                shortest = p;
            }
        }

        return shortest;
    }

    public Person take(){
        ArrayList<Person> plist = this.list;

        if(plist.isEmpty()){
            return null;
        }

        Person shortest = plist.get(0);
        int index = 0;

        for(int i = 0; i < plist.size(); i++){
            Person p = plist.get(i);
            if(p.getHeight() < shortest.getHeight()){
                shortest = p;
                index = i;
            }
        }

        plist.remove(index);
        return shortest;
    }
}