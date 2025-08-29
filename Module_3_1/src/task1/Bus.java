package task1;

public class Bus  extends task1.Car {
    int passengers;
    public Bus(String typeName) {
        super(typeName);
        this.passengers = 0;
    }

    public void passengerEnter() {
        passengers += 1;
    }

    public void passengerExit() {
        passengers -= 1;
    }

    public int getPassengers () {
        return passengers;
    }
}
