import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int x = sc.nextInt();
            int a = generateRandomValue();
            System.out.println("The random value is: " + a);

            if (x < 0) {
                double result = x + Math.pow(2.0, Math.sin(1 / x - a) + 4);
                System.out.printf("For x < 0, result = %.3f%n", result);
            } else if (x >= 0) {
                double result = a * x / Math.sqrt((a * a) - (x * x));
                System.out.printf("For x >= 0, result = %.3f%n", result);
            }

        } catch (InputMismatchException ex) {
            System.out.println("You didn't enter a number.");
        } catch (ArithmeticException ex) {
            System.out.println("Cannot perform the arithmetic operation.");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("An unknown error occurred.");
            ex.printStackTrace();
        }
    }

    public static int generateRandomValue() {
        Random rand = new Random();
        return rand.nextInt(101) - 50; // Generates a random integer from -50 to 50 (inclusive)
    }
}
