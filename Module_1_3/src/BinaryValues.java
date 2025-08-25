import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        int decimalNumber = 0;
        for (int i = 0; i < binaryNumber.length(); i++ ) {
            int number = Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length()-1-i)));
            decimalNumber += number*Math.pow(2,i);
        }
        System.out.println(decimalNumber);
    }
}
