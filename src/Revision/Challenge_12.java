package Revision;
import java.util.Scanner;
public class Challenge_12 {
    static void main(String[] args) {
        System.out.println("Showing a program that calculates simple intrest\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int simp = input.nextInt();
        System.out.print("Enter rate of intrest: ");
        int rate = input.nextInt();
        System.out.print("Enter time: ");
        int time = input.nextInt();
       double simpleIntrest = (simp * time * rate ) /100;


        System.out.println("The simple intrest is: " + simpleIntrest);


    }
}
