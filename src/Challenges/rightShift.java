package Challenges;
import java.util.Scanner;

public class rightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasig bitwise rightshift operator \n");
        System.out.println("Enter your number: " );
        int num = input.nextInt();

        int result =  num >> 1;
        System.out.println("Result is: " + result);
    }
}
