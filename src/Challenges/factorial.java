package Challenges;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that prints factorial of a given number\n");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
    }
    public static long factorial(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
            while( i <= num){
                fact *= i;
                i++;
            }
        return fact;
    }

}
