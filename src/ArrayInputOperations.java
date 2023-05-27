import java.util.Scanner;
import java.util.Random;

public class ArrayInputOperations {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter k1: ");
            int k1 = scanner.nextInt();

            System.out.print("Enter k2: ");
            int k2 = scanner.nextInt();

            System.out.print("Enter n: ");
            int n = scanner.nextInt();

            double[] x = new double[n];

            readFromRange(x, k1, k2);

            fillRangeWithRandom(x, 0, k1-1);
            fillRangeWithRandom(x, k2+1, n-1);

            System.out.println("x:");
            for (double value : x) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
