import org.junit.Assert;
import org.junit.Test;

public class VehiclesTest {

    String name = "Ford F150";
    int price = 1500;
    int year = 2000;
    int mpg = 23;
    boolean awd = false;

    public void vehicleCreator(){
        Vehicle vehicleA = new Vehicle(name, year,awd,price, mpg);
        Vehicle vehicleB = new Vehicle("Toyota Tacoma", year + 2, !awd, price+price/2, mpg/3 + mpg/2);
        Vehicle vehicleC = new Vehicle("Ram 2500", year - 3, awd, price +100, mpg);
    }

    //Given

@Test
public void constructTest(){
    Vehicle vehicles = new Vehicle();
    Assert.assertEquals("Name failed",vehicles.getMakeModel(), "");
    Assert.assertEquals("year failed", vehicles.getModelYear(), 0);
    Assert.assertEquals("mpg failed",vehicles.getMpg(), 0);
    Assert.assertEquals("price failed",vehicles.getRetailPrice(), 0);
    Assert.assertEquals("awd failed",vehicles.isAWD(), false);
}

}