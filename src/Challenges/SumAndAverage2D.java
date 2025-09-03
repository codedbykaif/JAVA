package Challenges;
import java.util.Scanner;

public class SumAndAverage2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0, count = 0;

        // Input elements
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
                sum += arr[i][j];
                count++;
            }
        }

        // Calculate average
        double average = (double) sum / count;

        // Output
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);

        input.close();
    }
}
