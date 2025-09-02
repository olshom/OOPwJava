package OrientationTask2_2;
import java.util.Comparator;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> qeueu;
    public EventList(){
       this.qeueu = new PriorityQueue<Event>(new Comparator<Event>() {
           @Override
           public int compare(Event o1, Event o2) {
               return o1.getTime() - o2.getTime();
           }
       });
    }

    public void addEvent (Event event) {
        this.qeueu.add(event);
    }

    public Event removeEvent () {
        return this.qeueu.poll();
    }

    public PriorityQueue<Event> getQeueu() {
        return this.qeueu;
    }
}
