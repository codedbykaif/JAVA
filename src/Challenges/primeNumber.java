package Challenges;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that checks whether the given number is prime or not");
        System.out.println("Enter your number");
        int num = input.nextInt();
        prime(num);

    }
    public static void prime(int num){
        if(num<=1){
            System.out.println("not prime");
            return;
        }
        int i = 2;
        while(i < num/2){
            if(num%i == 0){
                System.out.println("No! it is not prime ");
                return;
            }
            i++;
        }
        System.out.printf("Yes! %d is prime number " , num);
    }
}
