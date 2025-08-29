package task1;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private boolean isCruiseControlOn;
    private int targetSpeed;


    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    public Car(String typeName, double gasolineLevel, double speed) {
        this.typeName = typeName;   // this refers to the object itself.
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 5;
        }
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
                gasolineLevel -= 2;
            }
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }

    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }
}
