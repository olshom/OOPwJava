package task1;

public class VehicleDemo {
    public static void main (String[] args) {
        Vehicle myCar = new Car("Petrol", "Red");
        Vehicle myMotocycle = new Motorcycle("Gasoline", "Black");
        Vehicle cityBus = new Bus("Diesel", 40);

        System.out.println("Vehicle Demonstration \n");

        myCar.start();
        myCar.stop();
        System.out.println(myCar.getInfo());
        System.out.println();

        myMotocycle.start();
        myMotocycle.stop();
        System.out.println(myMotocycle.getInfo());
        System.out.println();

        cityBus.start();
        cityBus.stop();
        System.out.println(cityBus.getInfo());
    }
}
