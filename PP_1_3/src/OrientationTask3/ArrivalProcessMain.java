package OrientationTask3;
import distributions.*;

// I don t move clock in arrival process.I will move them only during Main program running time. I just generate number for creating event time.

public class ArrivalProcessMain {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList events = new EventList();
        ContinuousGenerator gen = new Negexp(0.5);
        ArrivalProcess arrivals = new ArrivalProcess(EventType.B1, gen);

        for (int i = 0; i < 10; i++) {
            arrivals.generateNext(events);
        }
        System.out.println("Generated events:");
        for (Event e : events.getEvents()) {
            System.out.println(e);
            Customer customer = new Customer(e.getTime()); //creating customer to the Service point queue
        }
    }
}
