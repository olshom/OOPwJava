package task1;

public class Main {
    public static void main (String[] args) {
        task1.SportsCar mySportcar = new task1.SportsCar("type", 100, 20);
        task1.Car myCar = new task1.Car("type", 100, 20);
        mySportcar.accelerate();
        mySportcar.accelerate();
        mySportcar.accelerate();
        System.out.println("my sportcar's speed " + mySportcar.getSpeed() + " and gasolin level " + mySportcar.getGasolineLevel());
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        System.out.println("my car's speed " + myCar.getSpeed() + " and gasolin level " + myCar.getGasolineLevel());
        task1.Bus cityBus = new task1.Bus("City Bus");
        cityBus.fillTank();
        cityBus.passengerEnter();
        cityBus.passengerEnter();
        cityBus.passengerEnter();
        System.out.println(cityBus.getTypeName() + " passengers: " + cityBus.getPassengers());
    }
}
