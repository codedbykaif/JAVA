package Revision;
import java.util.Scanner;
public class Challenge_15 {
    public static void main(String[] args){
        System.out.println("Writing a program that determines if a number is positive, negative, or zero\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to check: ");
        int num = input.nextInt();
        if(num == 0){
            System.out.println("The entered number is zero");
        } else if (num>0) {
            System.out.println("The entered number is positive");

        }
        else if(num<0){
            System.out.println("The entered number is negative");
        }
        else {
            System.out.println("The entered number is not valid");
        }

    }
}
