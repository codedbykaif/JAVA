package Challenges;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the palindrome program");
        System.out.println("Enter your number");
        int num = input.nextInt();
        ispalindrome(num);


    }
    public static void ispalindrome(int num){
        int real = num;
        int reverse = 0;
        while (num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;

        }
        if(real == reverse){
            System.out.println("The entered number is palindrome");
        }
        else{
            System.out.println("The entered number is not palindrome");
        }
    }
}
