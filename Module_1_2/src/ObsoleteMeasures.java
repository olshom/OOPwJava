import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");

        int grams = scanner.nextInt();

        double totalLuoti = grams/13.28;
        int leiviska = (int) totalLuoti / (32 * 20 );
        //to count how much luoti remain after leiviska and convert them into naula by dividing by 32 luoti
        int naula =(int) ( totalLuoti % (32 * 20 )) / 32;
        // the same logic, but counting the remainder of luoti after naula
        double luoti = ( totalLuoti % (32 * 20 )) % 32;

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti. ", grams, leiviska, naula, luoti);
    }
}
