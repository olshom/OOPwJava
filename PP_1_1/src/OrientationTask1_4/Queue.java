package OrientationTask1_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> customersQueue= new LinkedList<>();
        boolean isOn = true;
        while(isOn) {
            System.out.println("Options: \n1. exit (press 1)\n2.create user and put him into queue (press 2)\n3.to serve user (press 3)");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                isOn = false;
            } else if (command.equals("2")) {
                customersQueue.add(new Customer());
            } else if (command.equals("3")) {
                if (!customersQueue.isEmpty()) {
                    Customer customerToRemove = customersQueue.removeFirst();
                    customerToRemove.setEndTime(System.currentTimeMillis());
                    System.out.println("Customer " + customerToRemove.getId() + " was in queue " + customerToRemove.calculateTimeSpent() + " s");
                }
            } else {
                System.out.println("You have only 1,2 and 3 options");
            }
            System.out.println("There are " + customersQueue.size() + " customers in queue");
        }

    }
}
