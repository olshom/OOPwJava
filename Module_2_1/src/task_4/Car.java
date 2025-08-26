package task_4;

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
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
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
    //getter
    public boolean isCruiseControlOn() {
        return isCruiseControlOn;
    }
    //setter;
    public void turnCruiseControlOn() {
        isCruiseControlOn = true;
    }
    public void turnCruiseControlOff() {
        isCruiseControlOn = false;
    }

    public void setCruiseControl(int speed) {
        targetSpeed = speed;
    }
    public int getTargetSpeed() {
        return targetSpeed;
    }
}
