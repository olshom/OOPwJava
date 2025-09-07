package OrientationTask3;

public class Customer {
    private int id;
    private double startTime; // arrival time from EventList
    private double endTime;
    private static int _id;

    public Customer(double startTime) {
        _id++;
        id = _id;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public double duration() {
        return endTime - startTime;
    }

    public String toString() {
        return id + ": " + duration();
    }
}
