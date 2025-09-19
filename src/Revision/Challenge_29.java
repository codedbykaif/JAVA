package Revision;
import java.util.Scanner;
public class Challenge_29 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that prints sum of all odd numbers till n numbers\n");

        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
    for(int i=1; i<=num; i++){
        if( i%2 !=0){
            sum = sum+i;
        }
    }
        System.out.println("The sum of odd numbers from 1 to " + num + " is " + sum);
    }
}
