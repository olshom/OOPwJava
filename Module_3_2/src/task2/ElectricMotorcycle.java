package task2;

public class ElectricMotorcycle extends AbstractVehicle {
    private String fuel;

    public ElectricMotorcycle(String fuel, double fuelEfficiency) {
        super("ElectricMotorcycle", fuelEfficiency);
        this.fuel = fuel;
    }
    @Override
    public String getInfo() {
        return (type + " Information:\n" + getType() + "\nFuel: " + fuel+ "\n The fuel efficiency is " + fuelEfficiency + " kWh/l");
    }
}
