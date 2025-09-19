package Revision;
import java.util.Scanner;
public class Challenge_21 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that shows Bitwise AND operator of two integers");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int result = num1 & num2;
        System.out.println("Result is: " + result);

    }
}
