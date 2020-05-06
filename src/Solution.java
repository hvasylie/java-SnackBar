public class Solution {
    public static void main(String[] args) {
        taskSolution();
    }

    public static void taskSolution() {

        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine vmFood = new VendingMachine("Food");
        VendingMachine vmDrink = new VendingMachine("Drink");
        VendingMachine vmOffice = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 35, vmFood.getId(), 1.75);
        Snack chocBar = new Snack("Chocolate bar", 36, vmFood.getId(), 1.0);
        Snack pretzel = new Snack("Pretzel", 30, vmFood.getId(), 2.0);

        Snack soda = new Snack("Soda", 24, vmDrink.getId(), 2.5);
        Snack water = new Snack("Water", 20, vmDrink.getId(), 2.75);

        customer1.buySnacks(soda, 3);
        System.out.println(customer1.getName() + "'s cash on hand " + customer1.getCashOnHand());
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity() + "\n");

        customer1.buySnacks(pretzel, 1);
        System.out.println(customer1.getName() + "'s cash on hand " + customer1.getCashOnHand());
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity() + "\n");

        customer2.buySnacks(soda, 2);
        System.out.println(customer2.getName() + "'s cash on hand " + customer2.getCashOnHand());
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity() + "\n");

        customer1.addCash(10);
        System.out.println(customer1.getName() + "'s cash on hand " + customer1.getCashOnHand() + "\n");

        customer1.buySnacks(chocBar, 1);
        System.out.println(customer1.getName() + "'s cash on hand " + customer1.getCashOnHand());
        System.out.println("Quantity of " + chocBar.getName() + " is " + chocBar.getQuantity() + "\n");

        pretzel.addQuantity(12);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity() + "\n");

        customer2.buySnacks(pretzel, 3);
        System.out.println(customer2.getName() + "'s cash on hand " + customer2.getCashOnHand());
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
    }
}
