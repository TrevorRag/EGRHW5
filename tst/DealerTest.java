import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class DealerTest {

    Dealer dealer3 = new Dealer();

    @Test
    public void loadTest(){
        dealer3.load("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        System.out.println(dealer3.getInventory());
    }

    @Test
    public void serializedTest(){
        dealer3.load("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        File file = Dealer.serializeDealer(dealer3);
        Assert.assertTrue(file.exists());
    }


    @Test
    public void deserializeTest(){
        dealer3.load("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        Dealer dealer4 = Dealer.deserializeDealer(new File("dealer9.ser"));
        Assert.assertEquals(dealer4.getInventory().printInventoryList(), dealer3.getInventory().printInventoryList());
    }
}
