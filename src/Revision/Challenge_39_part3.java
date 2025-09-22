package Revision;
import java.util.Scanner;
public class Challenge_39_part3 {
    static void main(String[] args) {
        System.out.println("Showing a program that prints Left Half Pyramid\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int rows = input.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
