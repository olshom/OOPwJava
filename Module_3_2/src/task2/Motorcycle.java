package task2;

public class Motorcycle extends AbstractVehicle {
    private String fuel;
    private String color;

    public Motorcycle(String fuel, String color,  double fuelEfficiency) {
        super("Motorcycle", fuelEfficiency);
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return ("Motorcycle Information:\n" + getType() + "\nFuel: " + fuel +"\nColor: " + color + "\n The fuel efficiency is " + fuelEfficiency+ " km/l");
    }
}
