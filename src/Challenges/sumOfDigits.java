
package Challenges;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing the sum of the digits of an integer given by user");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;

        }
        System.out.println("sum of digit is: "  + sum);


    }
}