
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Dealer implements Serializable {


    private Inventory inventory = new Inventory();

    public Dealer(){
    }

    public Dealer(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void load(String webData){
        File file = new File("inventory.txt");
        List<String[]> attrList = new ArrayList<>();

        try {
            FileUtils.copyURLToFile(new URL(webData), file);
            LineIterator it = FileUtils.lineIterator(file);

            while (it.hasNext()){
                String line = it.nextLine();
                attrList.add(StringUtils.splitByWholeSeparatorPreserveAllTokens(line,","));
            }

            for (String[] arrays : attrList) {
                Vehicle vehicle;
                if (!(arrays[3].equals("TRUE"))) {
                    vehicle = new Vehicle(arrays[0], Integer.parseInt(arrays[1]), false, Integer.parseInt(arrays[2]), 0);
                } else {
                    vehicle = new Vehicle(arrays[0], Integer.parseInt(arrays[1]), Boolean.parseBoolean(arrays[3]), Integer.parseInt(arrays[2]), 0);
                }
                inventory.addVehicle(vehicle);
            }

        }
        catch(IOException e){
            System.out.println("error");
        }
    }

    public static File serializeDealer(Dealer dealer){
        File file = FileUtils.getFile("dealer" + dealer.getInventory().getInventory().size() + ".ser");
        byte[] dataToBeSerialized = SerializationUtils.serialize(dealer);
        try{
            FileUtils.writeByteArrayToFile(file,dataToBeSerialized);
            return file;
        }catch (IOException e){
            e.printStackTrace();
        }
        return file;
    }

    public static Dealer deserializeDealer(File serialFile){
        byte[] dataToDeserialize = null;
        try {
            dataToDeserialize = FileUtils.readFileToByteArray(serialFile);
        } catch (IOException f) {
            f.printStackTrace();
        }
        Dealer dealer = SerializationUtils.deserialize(dataToDeserialize);
        return dealer;
    }





}
