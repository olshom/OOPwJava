import java.util.Scanner;

public class MultiplicatorAssistant {
    public static void main (String[] args) {
        boolean isTen = false;
        Scanner scanner = new Scanner(System.in);
        while (!isTen) {
            int answers = 0;
            for (int n = 0; n<10; n++) {
                int firstInt = (int) (Math.random() * 10) + 1;
                int secondInt = (int) (Math.random() * 10) + 1;
                System.out.println("Enter an answer: " + firstInt + " * " + secondInt + " = ");
                int userAnswer = Integer.parseInt(scanner.nextLine());
                if (userAnswer==firstInt*secondInt) {
                    System.out.println("Correct!");
                    answers += 1;
                } else {
                    System.out.println("Incorrect");
                }
            }
            if (answers == 10) {
                System.out.println("Congratulations!!! You solved all exercises correctly!");
                isTen = true;
            } else {
                System.out.println("Out of 10 exercises you solved only " + answers + ". You need to practice more.");
            }
        }
    }
}
