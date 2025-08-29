package task1;

public class Motorcycle implements Vehicle {
    private String fuel;
    private String color;
    private String type;

    public Motorcycle (String fuel, String color) {
        this.type = "Motorcycle";
        this.fuel = fuel;
        this.color = color;
    }
    public void start() {
        System.out.println("Motorcycle is starting...");
    }
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return ("Motorcycle Information:\nType: Motorcycle\nFuel: " + fuel +"\nColor: " + color);
    }
}
