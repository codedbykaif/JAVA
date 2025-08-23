import java.util.Scanner;

public class productFloat {
    public static void main(String[] args){
        System.out.println("Welcome to float value calculataor: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        float a = input.nextFloat();
        System.out.println("Enter your second float number: ");
        float b = input.nextFloat();
        System.out.println("The product of two floating numbers are: " + (a*b));
    }
}
