import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(20);
        list.add(15);
        list.add(3);
        list.add(12);
        list.removeIf(n -> n % 2 == 0); // Remove even numbers
        list.replaceAll(n -> n * 2); // Square each number
        int[] sum = {0};
        list.forEach(n -> sum[0] += n); // Sum all numbers
        System.out.println("Processed list: " + list);
        System.out.println("Sum: " + sum[0]);
    }
}
