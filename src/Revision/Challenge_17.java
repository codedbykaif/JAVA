package Revision;
import java.util.Scanner;
public class Challenge_17 {
    public static void main(String[] args){
        System.out.println("Showing a program that prints greatest of three number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = input.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is largest: "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is larges: " + num2);
        }
        else {
            System.out.println("Number 3 is largest: " + num3);
        }
    }
}
