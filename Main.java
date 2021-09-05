import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, to the Random Number Guessing Game.");
        Random n = new Random();
        int number = n.nextInt(101);
        System.out.println("Take a guess, 1-100: ");
        String in = input.nextLine();
        if (Integer.parseInt(in) > 100 || Integer.parseInt(in) < 0) {
            System.out.println("Invalid input");
        } else {
            if (Integer.parseInt(in) == number) {
                System.out.println("Your guess was correct!");
            } else {
                System.out.println("Your guess was incorrect.");
            }
        }
    }
}
