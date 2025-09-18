package Revision;
import java.util.Scanner;
public class Challenge_9 {

    static void main(String[] args) {
        System.out.println("Showcasing the product of two floating numbers\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter your second number: ");
        float num2 = input.nextFloat();

        System.out.println("The product of two float number is: " + (num1 * num2));

    }
}
