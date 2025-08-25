import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient a of a quadratic equation: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the coefficient b of a quadratic equation: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the coefficient c of a quadratic equation: ");
        int c = Integer.parseInt(scanner.nextLine());

        double d = Math.pow(b, 2) - 4*a*c;
        if (d<0) {
            System.out.println("No real roots");
        } else if (d==0) {
            System.out.println("" + -b/2*a);
        } else {
            double x1 = (-b + Math.sqrt(d))/2*a;
            double x2 = (-b - Math.sqrt(d))/2*a;
            System.out.print(x1 + " " + x2);
        }
    }
}