import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InventoryTest {



    //Given
    Vehicle car = new Car("corvette", 1998,false, 13000, 31, true);
    Vehicle truck = new Truck("F150", 2001, true, 11500, 28, true, 4);
    Vehicle bike = new Vehicle("Speedy", 1984, true, 100, 1000000000);
    Inventory inventoryA = new Inventory();
    Inventory inventory = new Inventory();

    @Before
    public void setUp(){
        inventoryA.addVehicle(car);
        inventoryA.addVehicle(truck);
        inventoryA.addVehicle(bike);
    }

    @Test
    public void inventoryConstruct(){
        Assert.assertEquals("inventory failed",inventory.getInventory(), new ArrayList<>());
    }


    @Test
    public void addTest(){
        Assert.assertTrue(inventoryA.getInventory().contains(car));
        Assert.assertTrue(inventoryA.getInventory().contains(truck));
        Assert.assertTrue(inventoryA.getInventory().contains(bike));
    }

    @Test
    public void removeTest(){
        inventoryA.removeVehicle(car);
        Assert.assertFalse(inventoryA.getInventory().contains(car));
        inventoryA.removeVehicle(truck);
        Assert.assertFalse(inventoryA.getInventory().contains(truck));
        inventoryA.removeVehicle(bike);
        Assert.assertFalse(inventoryA.getInventory().contains(bike));
    }

    @Test
    public void cheapestTest(){
        Assert.assertEquals("wrong",inventoryA.findCheapestVehicle(), bike);
        inventoryA.removeVehicle(bike);
        Assert.assertEquals("wrong",inventoryA.findCheapestVehicle(), truck);
        inventoryA.removeVehicle(truck);
        Assert.assertEquals("wrong",inventoryA.findCheapestVehicle(), car);
    }

    @Test
    public void expensiveTest(){
        Assert.assertEquals("wrong",inventoryA.findMostExpensiveVehicle(), car);
        inventoryA.removeVehicle(car);
        Assert.assertEquals("wrong",inventoryA.findMostExpensiveVehicle(), truck);
        inventoryA.removeVehicle(truck);
        Assert.assertEquals("wrong",inventoryA.findMostExpensiveVehicle(), bike);
    }

    @Test
    public void avgPriceTest() {
        inventoryA.printAveragePriceofVehicles();
        inventoryA.removeVehicle(car);
        inventoryA.printAveragePriceofVehicles();
        inventoryA.removeVehicle(bike);
        inventoryA.printAveragePriceofVehicles();
    }


}