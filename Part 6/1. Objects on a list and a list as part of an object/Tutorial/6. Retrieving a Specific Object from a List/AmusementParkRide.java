import java.util.*;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<Person>();
    }

    public Person getTallest() {
        ArrayList<Person> list = this.riding;
        if(list.isEmpty()){
            return null;
        }

        Person largest = list.get(0);
        for(Person p: list){
            if(p.getHeight() > largest.getHeight()){
                largest = p;
            }
        }

        return largest;
    }

    public double averageHeightOfPeopleOnRide(){
        if(this.riding.isEmpty()){
            return -1;
        }

        int sum = 0;

        for(Person p: this.riding){
            sum += p.getHeight();
        }

        return 1.0 * sum / this.riding.size();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.riding.add(person);
        this.visitors++;
        
        return true;
    }

    public void removeEveryoneOnRide() {
        this.riding.clear();
    }

    @Override
    public String toString() {
        String onTheRide = "";
        for(Person p: this.riding){
            onTheRide += p.getName() + "\n";
        }

        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors + "\n" +
            "riding:\n" + onTheRide;
    }
}