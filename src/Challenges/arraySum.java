import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

        input.close();
    }
}
