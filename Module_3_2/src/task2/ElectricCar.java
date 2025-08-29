package task2;

public class ElectricCar extends AbstractVehicle{
    private String fuel;

    public ElectricCar(String fuel, double fuelEfficiency) {
        super("ElectricCar", fuelEfficiency);
        this.fuel = fuel;
    }
    @Override
    public String getInfo() {
        return (type + " Information:\n" + getType() + "\nFuel: " + fuel + "\n The fuel efficiency is " + fuelEfficiency + " kWh/l");
    }
}
