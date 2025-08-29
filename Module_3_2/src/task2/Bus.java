package task2;

public class Bus extends AbstractVehicle {
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity,double fuelEfficiency) {
        super("Bus", fuelEfficiency);
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return ("Bus Information:\n" + getType() + "\nFuel: " + fuel +"\nCapacity: " + capacity + " passengers.\n The fuel efficiency is " + fuelEfficiency + " km/l");
    }
}
