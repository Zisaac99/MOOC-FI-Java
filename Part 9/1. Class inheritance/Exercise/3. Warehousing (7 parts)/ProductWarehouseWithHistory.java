import java.util.*;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private double initialBalance;
    private ChangeHistory historyManager;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.initialBalance = initialBalance;
        super.addToWarehouse(initialBalance);
        this.historyManager = new ChangeHistory();

        this.historyManager.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.historyManager.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        super.takeFromWarehouse(amount);
        this.historyManager.add(super.getBalance());

        return super.getBalance();
    }

    public void printAnalysis(){
        System.out.println("Name: " + super.getName());
        System.out.println("History: " + this.historyManager);
        System.out.println("Largest amount of product: " + this.historyManager.maxValue());
        System.out.println("Smallest amount of product: " + this.historyManager.minValue());
        System.out.println("Average: " + this.historyManager.average());
    }

    public String history(){
        return this.historyManager.toString();
    }
}