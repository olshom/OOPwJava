package task2;

public class Car extends AbstractVehicle {
    private String fuel;
    private String color;

    public Car(String fuel, String color, double fuelEfficiency) {
        super("Car", fuelEfficiency);
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return ("Car Information:\n" + getType() + "\nFuel: " + fuel +"\nColor: " + color + "\n The fuel efficiency is" + fuelEfficiency + " km/l");
    }
}
