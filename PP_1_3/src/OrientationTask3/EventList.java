package OrientationTask3;
import java.util.ArrayList;
import java.util.List;

public class EventList {
        private List<Event> events = new ArrayList<>();

        public void add(Event e) {
            events.add(e);
        }

        public List<Event> getEvents() {
            return events;
        }
}
