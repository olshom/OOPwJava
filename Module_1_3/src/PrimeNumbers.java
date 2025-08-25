import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int startNumber = Integer.parseInt(scanner.nextLine());
        while (startNumber <= 1) {
            System.out.println("Start number should be positive and greater than 1: ");
            startNumber = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter end number: ");
        int endNumber = Integer.parseInt(scanner.nextLine());
        while (endNumber <= 0 || endNumber < startNumber) {
            System.out.println("End number should be positive and greater than start number: ");
            endNumber = Integer.parseInt(scanner.nextLine());
        }
        String result = "Prime number between " + startNumber + " and " + endNumber + ": ";
        if (startNumber==2) {
            result += "2 ";
        }
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= i/2 + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result += i + " ";
            }
        }
        System.out.println(result);
    }
}
