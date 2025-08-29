package task1;

public class Car implements Vehicle {
    private String fuel;
    private String color;
    private String type;

    public Car (String fuel, String color) {
        this.type = "Car";
        this.fuel = fuel;
        this.color = color;
    }
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return ("Car Information:\nType: Car\nFuel: " + fuel +"\nColor: " + color);
    }
}
