import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    //Given

    String name = "Ford F150";
    int price = 1500;
    int year = 2000;
    int mpg = 23;
    boolean awd = false;
    boolean isConvert = true;

    public void vehicleCreator(){
        Car carA = new Car(name, year,awd,price, mpg, isConvert);
        Car carB = new Car("Toyota Tacoma", year + 2, !awd, price+price/2, mpg/3 + mpg/2, !isConvert);
        Car carC = new Car("Ram 2500", year - 3, awd, price +100, mpg, isConvert);
    }

   @Test
    public void contructTest(){
       Car car = new Car();
       Assert.assertEquals("isConvert failed",car.isConvert(), false);
   }

}