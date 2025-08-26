package task_3;

import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        if (!coffeeMaker.isOn()) {
            coffeeMaker.pressOnOff();
            System.out.println("Coffee maker is on");
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select for coffee type: (normal/espresso)");
        String type = scanner.nextLine();
        coffeeMaker.setCoffeeType(type);

        System.out.println("Select for coffee amount: (10–80 ml)");
        int amount = scanner.nextInt();
        coffeeMaker.setCoffeeAmount(amount);

        System.out.println("Coffee type is " + type);
        System.out.println("Coffee amount is " + amount + " ml.");
        coffeeMaker.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}
