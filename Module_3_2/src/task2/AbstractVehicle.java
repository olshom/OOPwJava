package task2;

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected double fuelEfficiency;
    public AbstractVehicle(String type, double fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }
    public void start(){
        System.out.println(type + " is starting...");
    };
    public void stop(){
        System.out.println(type + " is stopping...");
    };
    public String getType() {
        return ("Type: " + type);
    };

    @Override
    public void charge() {
        if (type.equals("ElectricCar") || type.equals("ElectricMotorcycle")) {
            System.out.println(type + " is charging ...");
        } else {
            System.out.println("No possible to charge.");
        }
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
