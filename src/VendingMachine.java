import java.util.ArrayList;
import java.util.Random;

public class VendingMachine {
    private int maxId;
    private int id = 0;
    private String name;
    ArrayList<Snack> snacks = new ArrayList<>();

    Random randomizer = new Random();

    public VendingMachine(String name) {
        this.maxId = this.id;
        this.id = randomizer.nextInt();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public void removeSnack(Snack snack) {
        snacks.remove(snack);
    }
}
