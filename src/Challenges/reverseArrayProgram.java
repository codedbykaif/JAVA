package Challenges;
import java.util.Scanner;

public class reverseArrayProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Print original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print reversed array
        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
