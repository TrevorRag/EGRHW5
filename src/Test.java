
public class Test {
    public static void main(String[] args) {
        Vehicle A = new Truck("Ford F-150", 2015, true, 1000, 20, false, 3);
        Vehicle B = new Car("Nissan Altima", 2012, false, 3000, 25, false);
        Vehicle C = new Car("Honda Civic", 1997, true, 2000, 23, true);
        Vehicle D = new Truck("Semi-Truck", 2015, true, 20000, 25, true, 10);

        Inventory inventory = new Inventory();
        inventory.addVehicle(A);
        inventory.addVehicle(B);
        inventory.addVehicle(C);
        inventory.addVehicle(D);

        System.out.println("Cheapest Vehicle: \n" + inventory.findCheapestVehicle() + "\n");
        System.out.println("Most Expensive Vehicle: \n"+inventory.findMostExpensiveVehicle()+"\n");
        inventory.printAveragePriceofVehicles();

        inventory.removeVehicle(A);

        System.out.println("Cheapest Vehicle: \n" + inventory.findCheapestVehicle() + "\n");
        System.out.println("Most Expensive Vehicle: \n"+inventory.findMostExpensiveVehicle()+"\n");
        inventory.printAveragePriceofVehicles();
        System.out.println(inventory);
    }
}
