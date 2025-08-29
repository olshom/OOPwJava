package task1;

public class SportsCar extends task1.Car {
    public SportsCar(String typeName, double gasolineLevel, double speed) {
        super(typeName, gasolineLevel, speed);
    }
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            setSpeed(getSpeed() + 20);
            setGasolineLevel(getGasolineLevel()-10);
        }
        else
            setSpeed(0);
    }
    void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0) {
                setSpeed(Math.max(0, getSpeed() - amount));
                setGasolineLevel(getGasolineLevel() - 5);
            }
        } else
            setSpeed(0);
    }
}
