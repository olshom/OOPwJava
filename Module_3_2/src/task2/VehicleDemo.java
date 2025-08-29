package task2;

public class VehicleDemo {
    public static void main (String[] args) {
        AbstractVehicle myCar = new Car("Petrol", "Red", 12);
        AbstractVehicle myMotorcycle = new Motorcycle("Gasoline", "Black", 12);
        AbstractVehicle cityBus = new Bus("Diesel", 40, 15);
        AbstractVehicle eCar = new ElectricCar("electricity", 15);
        AbstractVehicle eMoto = new ElectricMotorcycle("electricity", 14);

        System.out.println("AbstractVehicle Demonstration \n");

        myCar.start();
        myCar.stop();
        myCar.charge();
        System.out.println(myCar.getInfo());
        System.out.println();

        myMotorcycle.start();
        myMotorcycle.stop();
        System.out.println(myMotorcycle.getInfo());
        System.out.println();

        cityBus.start();
        cityBus.stop();
        System.out.println(cityBus.getInfo());
        System.out.println();

        eCar.start();
        eCar.stop();
        eCar.charge();
        System.out.println(eCar.getInfo());
        System.out.println();

        eMoto.start();
        eMoto.stop();
        eMoto.charge();
        System.out.println(eMoto.getInfo());
    }
}
