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

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.riding.add(person);
        this.visitors++;
        
        return true;
    }

    public String toString() {
        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors;
    }
}