package Revision;
import java.util.Scanner;
public class Challenge_23 {
    static void main(String[] args) {;
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that shows bitwise XOR operator\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int result = num1 ^ num2;
        System.out.println("Result is: " + result);

    }
}
