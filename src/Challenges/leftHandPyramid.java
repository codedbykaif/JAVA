package Challenges;
import java.util.Scanner;
public class leftHandPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to pattern printing");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        pattern1(num);
    }
    public static void pattern1(int num){
        int row = 1;
        while( row < num){
            int coll = num;
            while(coll > row){
                System.out.print("\t");
                coll--;
            }
            int star = 0;
            while(star < row){
                System.out.print("*");
                System.out.print("\t");
                star++;
            }
            System.out.println();
            row++;
        }

    }
}
