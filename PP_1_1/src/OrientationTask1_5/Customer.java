package OrientationTask1_5;

public class Customer {
    private static int allId = 0;
    private int id;
    long startTime;
    long endTime;

    public Customer() {
        this.id = ++allId;
        this.startTime = System.currentTimeMillis();
    }

    public int getId () {
        return id;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long calculateTimeSpent () {
        if (getStartTime() != 0 && getEndTime() != 0) {
            return (getEndTime() - getStartTime());
        }
        return 0;
    }
}
