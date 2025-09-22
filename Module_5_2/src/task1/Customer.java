package task1;

public class Customer implements Runnable{
    private Theater theater;
    private int id;
    private static int idCounter = 0;

    public Customer(Theater theater) {
        this.theater = theater;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public String reserveSeats(int seats) {
        if(theater.reserve(seats)){
            return "Customer " + id + " successfully reserved " + seats + " seats.";
        } else {
            return "Customer " + id + " failed to reserve " + seats + " seats. Not enough capacity.";
        }
    }

    @Override
    public void run() {
        int seatsToReserve = (int)(Math.random() * 4) + 1; // Randomly reserve between 1 to 4 seats
        String result = reserveSeats(seatsToReserve);
        System.out.println(result);
    }
}
