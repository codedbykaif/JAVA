package Revision;
import java.util.Scanner;
public class Challenge_30 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints factorial of given number\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact *i;

        }
        System.out.println("Factorial of " + num + " is " + fact );


    }
}
