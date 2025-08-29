package task1;

public class Bus implements Vehicle {
    private String fuel;
    private int capacity;
    private String type;

    public Bus (String fuel, int capacity) {
        this.type = "Bus";
        this.fuel = fuel;
        this.capacity = capacity;
    }
    public void start() {
        System.out.println("Bus is starting...");
    }
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return ("Bus Information:\nType: Bus\nFuel: " + fuel +"\nCapacity: " + capacity + " passengers.");
    }
}
