public class Thread extends java.lang.Thread {
    private int number;
    private int delay;
    private String message;

    public Thread(int number, int delay, String message) {
        this.number = number;
        this.delay = delay;
        this.message = message;
    }

    public void run() {
        try {
            while (number < 21) {
                System.out.println(message + " " + number);
                this.number +=2;
                java.lang.Thread.yield();
                java.lang.Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + message + " interrupted.");
        }
    }

    public static void main(String[] args) {

        new Thread(1, 10, "Odd Thread").start();
        new Thread(2, 10, "Even Thread").start();

    }
}
