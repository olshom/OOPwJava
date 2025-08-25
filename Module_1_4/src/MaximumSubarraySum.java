import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        for (int i=0; i < size; i++) {
            System.out.printf("Enter integer %d: ", (i+1));
            numbers[i] = scanner.nextInt();
        }

        int maxSumma = numbers[0];
        int startMaxSubstring = numbers[0];
        int endMaxSubstring = numbers[0];

        for (int i=1; i < size; i++) {
            int summaSubstring = 0;
            for (int j = i; j >= 0; j--) {
                summaSubstring += numbers[j];
                if (summaSubstring > maxSumma) {
                    maxSumma = summaSubstring;
                    startMaxSubstring = j;
                    endMaxSubstring = i;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSumma);
        System.out.println("Integers: " + (startMaxSubstring + 1) + "-" + (endMaxSubstring + 1));
    }
}
