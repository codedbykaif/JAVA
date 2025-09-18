package Revision;
import java.util.Scanner;
public class Challenge_13 {
    static void main(String[] args) {
        System.out.println("Showcasing a program that prints compound intrest\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount: ");
        int principle = input.nextInt();
        System.out.print("Enter your rate of intrest: ");
        int rate = input.nextInt();
        System.out.print("Enter your time: ");
        int time = input.nextInt();
       double  compoundIntresst = principle * (1 + (rate / 100)) * time;
        System.out.println("Your compound intrest is: " + compoundIntresst);

    }
}
