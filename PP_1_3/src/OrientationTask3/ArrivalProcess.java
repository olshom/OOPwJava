package OrientationTask3;
import distributions.*;

public class ArrivalProcess {
    private EventType eventType;
    private ContinuousGenerator generator;

    public ArrivalProcess(EventType eventType, ContinuousGenerator generator) {
        this.eventType = eventType;
        this.generator = generator;
    }
    public void generateNext(EventList list) {
    //    Clock clock = Clock.getInstance();
    //    double currentTime = clock.getTime();

        double interval = generator.sample();   // I will create here some time value for creating Event
    //    double newTime = currentTime + interval;

        // move the clock
    //    clock.setTime(newTime);

        // create and add event
        Event e = new Event(eventType, interval);
        list.add(e);
    }
}
