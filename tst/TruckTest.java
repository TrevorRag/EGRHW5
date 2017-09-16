import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {

    //Given
    String name = "F150";
    int price = 1500;
    int year = 2000;
    int mpg = 23;
    boolean awd = false;
    int towCap = 4;
    boolean hasSide = true;

    public void truckCreator(){
        Truck truckA = new Truck(name, year,awd,price, mpg, hasSide,towCap);
        Truck truckB = new Truck("Toyota Tacoma", year + 2, !awd, price+price/2, mpg/3 + mpg/2, !hasSide, towCap++);
        Truck truckC = new Truck("Ram 2500", year - 3, awd, price +100, mpg + towCap++, !hasSide, towCap--);
    }

    @Test
    public void constructorTest(){
        Truck truck = new Truck();
        Assert.assertEquals("sideStepfailed",truck.isHasSideStep(), false);
        Assert.assertEquals("tCap failed",truck.getTowCapacity(), 0);
    }

}