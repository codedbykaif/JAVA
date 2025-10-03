package Exception_and_file_handeling;
import java.util.Scanner;
public class challenge {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Enter first number: ");
        int first  = input.nextInt();
        System.out.print("Now enter second number: ");
        int second = input.nextInt();
        try{
            int result = first / second;
            System.out.printf("Result is %d", result);

        } catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occured.");
            } else{
                throw exception;
            }
        }
    }
}
