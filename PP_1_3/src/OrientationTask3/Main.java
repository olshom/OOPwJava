package OrientationTask3;

public class Main {
    public static void main(String[] args) {
            Clock clock = Clock.getInstance();

            System.out.println("Initial time: " + clock.getTime());

            clock.setTime(5.0);
            System.out.println("After setTime(5.0): " + clock.getTime());

            clock.advanceTime(3.2);
            System.out.println("After advanceTime(3.2): " + clock.getTime());

            Clock anotherReference = Clock.getInstance();
            System.out.println("Time via another reference: " + anotherReference.getTime());

            anotherReference.advanceTime(1.5);
            System.out.println("After advancing via second ref: " + clock.getTime());
        }
    }
