import java.util.Scanner;
import java.util.Random;

public class RandomArrayOperations {

    public static void readFromRange(double[] array, int start, int end) {
        Scanner scanner = new Scanner(System.in);
        for (int i = start; i <= end; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextDouble();
        }
    }

    public static void fillRangeWithRandom(double[] array, int start, int end) {
        Random random = new Random();
        for (int i = start; i <= end; i++) {
            array[i] = random.nextDouble();
        }
    }

    public static void printArray(String message, double[] array) {
        System.out.println(message);
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] array = new double[10];

        readFromRange(array, 2, 5);
        printArray("Array after user input:", array);

        fillRangeWithRandom(array, 1, 4);
        printArray("Array after filling with random numbers:", array);
    }
}
