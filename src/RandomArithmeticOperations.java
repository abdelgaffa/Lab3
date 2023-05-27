import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a value for x: ");
                double x = scanner.nextDouble();
                double y = calculateFunction(x);
                System.out.printf("For x = %.1f, y = %.3f%n", x, y);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Your input is not a number.");
        } catch (IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An unknown error occurred.");
            ex.printStackTrace();
        }
    }

    public static double calculateFunction(double x) throws IllegalAccessException {
        double a = Math.random() * 101 - 50;

        if (x < 0) {
            if (x == a) throw new IllegalAccessException("Zero in denominator.");
            return x + Math.pow(Math.sin(1.0 / (x - a) + 4.0), 2.0);
        } else {
            if (x >= a) throw new IllegalAccessException("Cannot perform square root of negative number or division by zero.");
            return a * x / Math.sqrt(a * a - x * x);
        }
    }
}
