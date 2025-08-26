package task_4;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

//        while (myCar.getSpeed() > 0) {
//            myCar.decelerate(15);
//            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to turn on cruise control? (yes/no)");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            myCar.turnCruiseControlOn();
        }

        if (myCar.isCruiseControlOn()) {
            System.out.println("Set up target speed: ");
            int cruiseControlSpeed = scanner.nextInt();
            if (cruiseControlSpeed < 40 || cruiseControlSpeed > 180) {
                myCar.turnCruiseControlOff();
                System.out.println("The target speed should be between 40 and 180 km/h");
            } else{
                myCar.setCruiseControl(cruiseControlSpeed);
                while(myCar.getSpeed() != myCar.getTargetSpeed()) {
                    if (myCar.getSpeed() < myCar.getTargetSpeed()) {
                        myCar.accelerate();
                        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
                    } else {
                        myCar.decelerate(1);
                        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

                    }
                }
            }
        }
    }
}
