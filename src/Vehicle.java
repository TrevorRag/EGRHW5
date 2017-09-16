import java.text.NumberFormat;

public class Vehicle {

    protected String makeModel = "";
    protected int modelYear;
    protected boolean isAWD;
    protected int retailPrice;
    protected int mpg;

    public Vehicle() {
    }

    public Vehicle(String name, int year, boolean isAWD, int price, int mpg) {
        makeModel = name;
        modelYear = year;
        this.isAWD = isAWD;
        retailPrice = price;
        this.mpg = mpg;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isAWD() {
        return this.isAWD;
    }

    public void setAWD(boolean AWD) {
        isAWD = AWD;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    private String is4WD(boolean awd) {
        if (awd) {
            return "4WD";
        }
        return "Not 4WD";
    }


    @Override
    public String toString() {
        NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();
        String nPrice = numberFormatter.format(getRetailPrice());
        return getModelYear() + " " + getMakeModel() + "\n" + is4WD(isAWD) + "\n" + nPrice + "\n" + getMpg() + " MPG";
    }

    public void printVehicle() {
        System.out.println(this);
    }
}
