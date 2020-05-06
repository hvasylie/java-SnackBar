import java.util.Random;

public class Snack {

    private int maxId;
    private int id = 0;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    Random randomizer = new Random();

    public Snack(String name, int quantity, int vendingMachineId, double cost) {
        this.maxId = this.id;
        this.id = randomizer.nextInt();
        this.name = name;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }
}
