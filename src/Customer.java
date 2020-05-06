import java.util.Random;

public class Customer {
    private int maxId;
    private int id = 0;
    private String name;
    private double cashOnHand;
    Random randomizer = new Random();

    public Customer(String name, double cash) {
        this.maxId = this.id;
        this.id = randomizer.nextInt();
        this.name = name;
        this.cashOnHand = cash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addCash(double addition) {
        this.cashOnHand = cashOnHand + addition;
    }

    public void buySnacks(Snack snack, int quantity) {
        snack.addQuantity(- quantity);
        cashOnHand = cashOnHand - (snack.getCost() * quantity);
    }
}
