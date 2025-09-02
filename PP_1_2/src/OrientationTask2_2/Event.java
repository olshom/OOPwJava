package OrientationTask2_2;

enum EventType {B1, B2}

public class Event {
    private EventType type;
    private int time;

    public Event (EventType type, int time) {
        this.type = type;
        this.time = time;
    }

    public int getTime(){return this.time;}

    public EventType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return ("event type is " + getType() + " time: " + getTime());
    }
}
