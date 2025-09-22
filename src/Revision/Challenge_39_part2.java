package Revision;
import java.util.Scanner;

public class Challenge_39_part2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints right half pyramind\n");
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        for(int i=rows; i>=1; i--){
            for(int j=1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
