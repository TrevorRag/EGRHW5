public class Truck extends Vehicle {
    private boolean hasSideStep;
    private int towCapacity;            // in tons

    public Truck(){
        super();
    }

    public Truck(String name, int year, boolean isAWD, int price, int mpg,
                 boolean hasSideStep, int tCapacity){
        super(name,year,isAWD,price,mpg);
        this.hasSideStep = hasSideStep;
        towCapacity = tCapacity;
    }

    public boolean isHasSideStep() {
        return hasSideStep;
    }

    public void setHasSideStep(boolean hasSideStep) {
        this.hasSideStep = hasSideStep;
    }

    public int getTowCapacity() {
        return towCapacity;
    }

    public void setTowCapacity(int towCapacity) {
        this.towCapacity = towCapacity;
    }

    private String sideStep(boolean sideStep){
        if(sideStep)
            return "Has Side Step";
        return "No Side Step";
    }

    @Override
    public String
    toString() {
        return super.toString() + "\n" + sideStep(hasSideStep) +
                "\nTow up to " + getTowCapacity() + " tons";
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
    }
}
