package OrientationTask3;

public class Event {
    private EventType type;
    private double time;

    public Event (EventType type, double time) {
        this.type = type;
        this.time = time;
    }

    public double getTime(){return this.time;}

    public EventType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return ("event type is " + getType() + " time: " + getTime());
    }
}
