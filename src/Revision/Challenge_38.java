package Revision;
import java.util.Scanner;
public class Challenge_38 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that verifiea if a number is palindrome or not\n");
        System.out.print("Enter your number ");
        int num = input.nextInt();
        ispalindrome(num);

    }
    public static void ispalindrome(int num){
        int real = num;
        int reverse = 0;
        while (num > 0){
            int rem = num % 10;
            reverse = reverse *10 + rem;
            num = num /10;
        }
        if(real == reverse){
            System.out.println("The entered number is palindrome");
        } else{
            System.out.println("The entered number is not palindrome");
        }

    }
}
