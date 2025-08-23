import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of first leg: ");
        double first_leg = scanner.nextDouble();
        System.out.print("Enter the length of second leg: ");
        double second_leg = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(first_leg, 2) + Math.pow(second_leg, 2));
        System.out.println("The length of the hypotenuse is: " + c);
    }

}
