package Revision;
import java.util.Scanner;
public class Challenge_8 {
    static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing the results of arithematic operators\n");

        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("The addition of two numbers are " + (num1 + num2));
        System.out.println("The substraction of two numbers are " + (num1 - num2));
        System.out.println("The division of two numbers are " + (num1 / num2));
        System.out.println("The multiplication of two numbers are " + (num1 * num2));
        System.out.println("The modulous of two numbers are " + (num1 % num2));


    }
}
