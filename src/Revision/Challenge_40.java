package Revision;
import java.util.Scanner;
public class Challenge_40 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints sum and average of an array\n");

        System.out.print("Enter number of elements in an array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elemets of the array");
        for(int i =0; i<n; i++){
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        double average = (double)sum/n;
        System.out.println("the sum of elements are: " + sum);
        System.out.println("The average of elements are: " + average);





    }
}
