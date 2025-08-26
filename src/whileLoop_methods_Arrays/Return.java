package whileLoop_methods_Arrays;
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second  number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of the number is: " + sum);
    }
    public static void greet() {
        System.out.println("Welcome to calculator \n");

    }
}
