package Challenges;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class primeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime checker program\n");
        System.out.println("Enter your number to check: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i=2; i<=num / 2; i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime");
        }

    }
}
