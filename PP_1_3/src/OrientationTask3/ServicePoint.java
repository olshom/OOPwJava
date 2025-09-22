package OrientationTask3;

import java.util.ArrayList;

public class ServicePoint {
    private ArrayList<Customer> queue;
    public ServicePoint() {
        this.queue = new ArrayList<>();
    }
    public void addCustomer(Customer c) {
        this.queue.add(c);
    }
    public ArrayList<Customer> getQueue() {
        return this.queue;
    }
    public void serveCustomer() {
        if(!this.queue.isEmpty()) {
            Customer c = this.queue.removeFirst();
            Clock clock = Clock.getInstance();
            c.setEndTime(clock.getTime());
            System.out.println("Served customer: " + c);
        } else {
            System.out.println("No customers to serve.");
        }
    }
}
