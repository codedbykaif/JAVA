package Revision;
import java.util.Scanner;
public class Challenge_16 {
    public static void main(String[] args){
        System.out.println("Showing a program that prints odd even\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to check : ");
        int num = input.nextInt();
        if(num % 2 == 0 ){
            System.out.println("The entered number is even");
        }
        else {
            System.out.println("The entered number is odd");
        }
    }
}
