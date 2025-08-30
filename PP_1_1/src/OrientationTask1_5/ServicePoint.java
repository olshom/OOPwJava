package OrientationTask1_5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class ServicePoint {
    long workingTimOfServicePoint = 0;
    LinkedList<Customer> queue= new LinkedList<>();
    public void addToQueue(Customer a) {
        queue.add(a);
    }
    public Customer removeFromQueue() {
        return queue.removeFirst();
    }
    public void serve() {
        while(!queue.isEmpty()){
            Customer servingCustomer = removeFromQueue();
            servingCustomer.setEndTime(System.currentTimeMillis());
            long serviceTime = (long) (Math.random()*10000);
            workingTimOfServicePoint +=serviceTime;
            try {
                Thread.sleep(serviceTime);  // 1000 ms = 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Customer " + servingCustomer.getId() + " was in queue " + servingCustomer.calculateTimeSpent() + " ms");

            System.out.println("The response time is " + (servingCustomer.calculateTimeSpent() + serviceTime));

        }
    }
}
