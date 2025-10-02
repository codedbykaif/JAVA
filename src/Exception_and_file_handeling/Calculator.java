package Exception_and_file_handeling;
import java.util.Scanner;
public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator\n");
        System.out.println("Enter your two numbers : ");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %f", result);
        } catch (ArithmeticException exception){
            System.out.printf("%s, Divide by zero, enter valid values", exception.getMessage());
        }






    }

}
