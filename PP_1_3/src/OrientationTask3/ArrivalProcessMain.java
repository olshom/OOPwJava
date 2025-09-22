package OrientationTask3;
import distributions.*;

public class ArrivalProcessMain {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList events = new EventList();
        ServicePoint servicePoint = new ServicePoint();
        ContinuousGenerator gen = new Negexp(0.5);
        ArrivalProcess arrivals = new ArrivalProcess(EventType.B1, gen);

        for (int i = 0; i < 10; i++) {
            arrivals.generateNext(events);
            Event lastEvent = events.getEvents().getLast();
            clock.setTime(lastEvent.getTime()); // moving clock to the last event time
        }
        System.out.println("Generated events:");
        for (Event e : events.getEvents()) {
            System.out.println(e);
            Customer customer = new Customer(e.getTime());
            //add customer to service point queue
            servicePoint.addCustomer(customer);
        }

        while (!servicePoint.getQueue().isEmpty()) {
            clock.setTime(clock.getTime() + 2.5); // advance time by 1.0 for each service
            servicePoint.serveCustomer();
        }
    }
}
