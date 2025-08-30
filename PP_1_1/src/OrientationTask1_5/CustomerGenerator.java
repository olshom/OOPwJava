package OrientationTask1_5;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerGenerator {
    int customers;
    public CustomerGenerator (int customers) {
        this.customers = customers;
    }
    public void create (ServicePoint point) {
        for (int i = customers; i>0; i--) {
            point.addToQueue(new Customer());
        }
    }
}
