public class StarTree {
    public static void main(String[] args) {
        for (int lines = 4; lines > 0; lines--) {
            for (int spaces = lines; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 9-(lines*2); stars++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
