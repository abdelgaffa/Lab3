import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            double x = scanner.nextDouble();

            if (x <= 1) {
                throw new ArithmeticException();
            }

            double result = 1 / (x - 1);
            System.out.printf("For x = %.1f, y = 1/( x - 1) = %.3f%n", x, result);

        } catch (InputMismatchException ex) {
            System.out.println("You didn't enter a number.");

        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero.");

        } catch (Exception ex) {
            System.out.println("Encountered unknown exception.");
            ex.printStackTrace();

        } finally {
            System.out.println("Computation completed.");
        }
    }
}
