import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 3, 12};
        int sum = Arrays.stream(arr).filter(n -> n % 2 != 0).map(n -> n * 2).sum();
        System.out.println("Sum of processed odd numbers: " + sum);
    }
}
