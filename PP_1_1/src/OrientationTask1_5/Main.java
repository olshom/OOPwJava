package OrientationTask1_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much clients to add to the queue?");
        int quantity = scanner.nextInt();
        CustomerGenerator generator = new CustomerGenerator(quantity);
        generator.create(servicePoint);
        servicePoint.serve();
        System.out.println("The average service time is " + servicePoint.workingTimOfServicePoint/((long)quantity ) + " ms.");
    }
}
