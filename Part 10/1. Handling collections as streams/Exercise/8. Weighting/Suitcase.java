import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }
        this.Items.add(Item);
    }

    public int totalWeight() {
        return this.Items.stream().mapToInt(item -> item.getWeight()).reduce(0, (prev, curr) -> prev + curr);
    }

    public void printItems() {
        Items.stream().forEach(item -> System.out.println(item));
    }

    public Item heaviestItem() {
        return this.Items.stream().max((first, second) -> first.getWeight() - second.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}