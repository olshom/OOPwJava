package OrientationTask1_3;

public class CustomerMain {
    public static void main (String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setStartTime(System.currentTimeMillis());
        customer2.setStartTime(System.currentTimeMillis());

        try {
            Thread.sleep(2000); // pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        customer2.setEndTime(System.currentTimeMillis());


        System.out.println("Customer " + customer1.getId() + " spent " + customer1.calculateTimeSpent() + " s");
        System.out.println("Customer " + customer2.getId() + " spent " + customer2.calculateTimeSpent() + " s");

    }
}
