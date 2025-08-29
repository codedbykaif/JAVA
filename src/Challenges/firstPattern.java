package Challenges;
import java.util.Scanner;
public class firstPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are here to print pattern\n");
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        firstPattern(rows);

    }
    public static void firstPattern(int maxRows){
        int rows = 0;
        while(rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
