public class Theater {
    private int capacity;

    public Theater(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public synchronized boolean reserve(int numberOfSeats) {
        int result = this.capacity - numberOfSeats;

        if (result < 0) {
            return false;
        } else {
            this.capacity = result;
            return true;
        }
    }
}
