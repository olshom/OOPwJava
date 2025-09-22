package task1;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);
        Thread[] customers = new Thread[10];
        for (int i = 0; i < 10; i++) {
            customers[i] = new Thread(new Customer(theater));
            customers[i].start();
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}