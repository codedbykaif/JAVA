package Revision;
import java.util.Scanner;
public class Challenge_31 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints sum of the digits of an integer\n");

        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;


        }
        System.out.println("Sum of digit is " + sum);


    }
}
