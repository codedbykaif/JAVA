package Challenges;
import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that prints the reverse of number");
        System.out.println("Enter your number ");
        int num = input.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int num) {
        int rev = 0;
        while(num > 0 ){
          int  digit = num % 10;
          rev = rev*10 + digit;
          num /= 10;

        }
        return rev;


    }
}
