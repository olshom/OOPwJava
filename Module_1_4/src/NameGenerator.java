import java.util.Scanner;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NameGenerator {
    public static void main(String[] args) {
        String[] firstNames = {
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia",
                "Kevin", "Laura", "Michael", "Nina", "Oscar",
                "Paula", "Quentin", "Rachel", "Samuel", "Tina",
                "Ursula", "Victor", "Wendy", "Xavier", "Yvonne",
                "Zach", "Amelia", "Brian", "Clara", "David"
        };
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown", "Jones",
                "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
                "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson",
                "Thomas", "Taylor", "Moore", "Jackson", "Martin",
                "Lee", "Perez", "Thompson", "White", "Harris",
                "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson"
        };
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("How many names do you want to generate?");
        int names = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < names; i++) {
            int firstNameIndex = r.nextInt(firstNames.length);
            int lastNameIndex = r.nextInt(lastNames.length);
            System.out.println(firstNames[firstNameIndex] + " " + lastNames[lastNameIndex]);
        }
    }
}