package Revision;
import java.util.Scanner;
public class Challenge_18 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that tells us whether the year is leap or not\n");
        System.out.print("Enter your year: ");
        int year = input.nextInt();
        if(year % 4==0 || ( year % 100 != 0 && year % 400 == 0)){
            System.out.println("The entered year is leap year");

        }
        else {
            System.out.println("The entered year is not leap year");
        }
    }
}
