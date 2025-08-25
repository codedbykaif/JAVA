package Challenges;
import java.util.Scanner;

public class leftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasig bitwise leftshift operator \n");
        System.out.println("Enter your number: " );
        int num = input.nextInt();

        int result =  num << 1;
        System.out.println("Result is: " + result);
    }
}
