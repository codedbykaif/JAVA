package Revision;
import java.util.Scanner;
public class Challenge_22 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that shows bitwise OR operator of two integers");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int result = (num1 | num2);
        System.out.println("Result is: " + result  );

    }
}
