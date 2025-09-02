package OrientationTask2_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventList simulation = new EventList();

        for (int i = 0; i <10; i++){
            int arrivalTime = (int)(Math.random()*30 + 1);
            simulation.addEvent(new Event(EventType.B1,arrivalTime));
            int exitTime = (int)(Math.random()*10 + 1);
            simulation.addEvent(new Event(EventType.B2,arrivalTime + exitTime));
        }

        System.out.println(simulation.removeEvent());
        System.out.println("This event was deleted.");

        List<Event> sortedView = new ArrayList<>(simulation.getQeueu());
        sortedView.sort(simulation.getQeueu().comparator());

        for (Event event: sortedView) {
            System.out.println(event);
        }
    }
}
