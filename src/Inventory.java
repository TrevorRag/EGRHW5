import java.text.NumberFormat;
import java.util.ArrayList;

public class Inventory {

    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public Inventory(){
    }

    public Inventory(ArrayList<Vehicle> inventory){
        vehicleList = inventory;
    }

    public ArrayList<Vehicle> getInventory() {
        return vehicleList;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        vehicleList = inventory;
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }

    public Vehicle findCheapestVehicle(){
        Vehicle lowest = this.vehicleList.get(0);
        for (Vehicle vehicle:this.vehicleList
             ) {
            if(vehicle.getRetailPrice() <= lowest.getRetailPrice()){
                lowest = vehicle;
            }
        }
        return lowest;
    }

    public Vehicle findMostExpensiveVehicle(){
        Vehicle highest = this.vehicleList.get(0);
        for (Vehicle vehicle: this.vehicleList
             ) {
            if(vehicle.getRetailPrice() >= highest.getRetailPrice()){
                highest = vehicle;
            }

        }
        return highest;
    }

    public void printAveragePriceofVehicles(){
        double total= 0;
        double count= 0;
        for (Vehicle vehicle: this.vehicleList
             ) {
            total+= vehicle.getRetailPrice();
            count++;
        }
        NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();
        String avgPrice = numberFormatter.format(total/count);
        System.out.println("Average price of the " + (int)count + " vehicles is: "+avgPrice+ "\n");
    }

    public String printInventoryList(){
        String list = "";
        for (Vehicle vehicle: getInventory()
             ) {
            list = list.concat(""+ vehicle + "\n\n");
        }
        return ("This inventory contains: \n\n" + list);
    }

    @Override
    public String toString() {
        return this.printInventoryList();
    }
}
