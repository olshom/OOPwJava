import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 3, 12};
        double mean = Arrays.stream(arr).average().orElse(Double.NaN);
        System.out.println("Mean: " + mean);

    }
}
