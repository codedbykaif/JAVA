package Challenges;
import java.util.Scanner;

public class sumOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that results the sum of ODD numbers upto n");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i =1; i<=num; i++){
            if( i %2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("sum of all odd numbers from 1 to " + num + " is: " + sum);

    }

}
