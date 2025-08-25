import java.util.Scanner;

public class RemovingDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", (i + 1));
            numbers[i] = scanner.nextInt();

            boolean isDuplicate = false;
            for (int j = i-1; j >= 0; j--) {
                if (numbers[j] == numbers[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                quantity += 1;
            }
        }
        int[] noDupes = new int[quantity];
        noDupes[0] = numbers[0];
        int nextIndex = 1;
        for (int i = 1; i<numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = i-1; j >= 0; j--) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                noDupes[nextIndex] = numbers[i];
                nextIndex += 1;
            }
        }
        for (int element : noDupes) {
            System.out.print(element + " ");
        }
    }
}
