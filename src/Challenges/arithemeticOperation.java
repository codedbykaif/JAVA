import java.util.Scanner;

public class arithemeticOperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a1 =input.nextInt();
        System.out.println("Enter second number");
        int a2 = input.nextInt();
        System.out.println("Addition(+): " + (a1 + a2));
        System.out.println("Subtraction(-): " + (a1-a2));
        System.out.println("Multiplication(*): " + (a1*a2));
        System.out.println("Division(/): " + (a1/a2));
        System.out.println("Modulous(%): " + (a1%a2));


    }
}
