
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }
        this.suitcases.add(Suitcase);
    }

    public int totalWeight() {
        return suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
    }

    public void printItems() {
        suitcases.stream().forEach(s -> System.out.println(s));
    }

    public Suitcase heaviestItem(){
        return suitcases.stream().max((first,second) -> first.totalWeight() - second.totalWeight()).get();
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}