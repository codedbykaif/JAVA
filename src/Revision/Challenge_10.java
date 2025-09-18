package Revision;
import java.util.Scanner;
public class Challenge_10 {
    static void main(String[] args) {
        System.out.println("Showcasing a program that calculates the perimeter of rectangle\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side of rectangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter second side of rectangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter third side of rectangle: ");
        int side3 = input.nextInt();
        System.out.print("Enter fourth side of rectangle: ");
        int side4 = input.nextInt();

        System.out.println("The perimeter of rectangle is: " + (side1 + side2 + side3 + side4));



    }
}
