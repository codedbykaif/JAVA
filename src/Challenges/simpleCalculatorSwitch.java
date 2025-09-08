package Challenges;
import java.util.Scanner;
public class simpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple calculator using switch");
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter an operator(+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator){
            case'+':
                result = num1 + num2;
                System.out.println("result = " + result);
                break;
            case'-':
                result = num1 - num2;
                System.out.println("result = " + result);
                break;
            case'*':
                result = num1 * num2;
                System.out.println("result = " + result);
                break;
            case'/':
                if(num2 != 0){
                    result = num1/num2;
                    System.out.println("result = " + result);
                } else {
                    System.out.println("error!, Division by zero");
                    break;
                }
            default:
                System.out.println("Invalid operator");


        }
    }
}
