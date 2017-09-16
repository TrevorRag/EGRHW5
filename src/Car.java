public class Car extends Vehicle {
    private boolean isConvert;

    public Car(){
        super();
    }

    public Car(String name, int year, boolean isAWD, int price, int mpg, boolean isConvert) {
        super(name, year, isAWD, price, mpg);
        this.isConvert = isConvert;
    }

    public boolean isConvert() {
        return isConvert;
    }

    public void setConvert(boolean convert) {
        isConvert = convert;
    }

    private String convertible(boolean convert){
        if(convert){
            return "Convertible";
        }
        return "Not A Convertible";
    }

    @Override
    public String toString() {

        return super.toString() + "\n" +
                convertible(isConvert);
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
    }
}
