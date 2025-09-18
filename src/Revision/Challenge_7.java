package Revision;
import java.util.Scanner;
public class Challenge_7 {
    static void main(String[] args) {
        System.out.println("Showcasing the swapping of two numbers\n");

            Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("a = " + num1 + ", b = " + num2 );
        int temp = num1;
         num1 = num2;
         num2 = temp;
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + num1 + ", b = " + num1);

    }
}
