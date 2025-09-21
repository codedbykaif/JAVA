package Revision;
import java.util.Scanner;
public class Challenge_35 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints reverse of entered number\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int reversed = 0;
        while(num !=0){
            int digit = num%10;
            reversed = reversed*10 + digit;
            num = num/10;

        }
        System.out.println("Reversed number is: " + reversed);


    }
}
