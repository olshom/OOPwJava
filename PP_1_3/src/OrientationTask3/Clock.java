package OrientationTask3;

public class Clock {
    private static Clock instance;
    private double time;
    private Clock() {
        this.time = 0.0;
    }
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }
    public void setTime(double newTime) {
        this.time = newTime;
    }

    public void advanceTime(double delta) {
        this.time += delta;
    }

    public double getTime() {
        return this.time;
    }
}
