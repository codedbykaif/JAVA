package Challenges;
import java.util.Scanner;
public class secondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print pattern \n");
        System.out.print("Enter your number of rows: ");
        int rows = input.nextInt();
        secondPattern(rows);


    }
    public static void secondPattern(int maxRows){
        int rows = maxRows;
        while (rows > 0){
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
